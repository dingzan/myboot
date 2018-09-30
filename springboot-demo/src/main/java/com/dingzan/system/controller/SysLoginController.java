package com.dingzan.system.controller;

import com.dingzan.pojo.SysLoginForm;
import com.dingzan.system.domain.User;
import com.dingzan.utils.MD5Utils;
import com.dingzan.utils.R;
import com.dingzan.utils.ShiroUtils;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 登录相关
 */
@Controller
@RequestMapping("/api")
public class SysLoginController {
	@Autowired
	private Producer producer;
	
	/**
	 * 返回登陆
	 */
	@GetMapping("/tologin")
	@ResponseBody
	public R tologin() {
		return R.error("请先登陆！");
	}
	
	
	@GetMapping("captcha.jpg")
	public void captcha(HttpServletResponse response)throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
	}
	
	/**
	 * 登录
	 */
	@ResponseBody
	@PostMapping(value = "/login")
	public R login(@RequestBody SysLoginForm form) {
//		String captcha = ShiroUtils.getCaptcha(Constants.KAPTCHA_SESSION_KEY);
//		if(!captcha.equalsIgnoreCase(form.getCaptcha())){
//			return R.error("验证码不正确");
//		}
		String password = form.getPassword();
		String username = form.getUsername();
		try{
			password = MD5Utils.encrypt(username, password);
			Subject subject = ShiroUtils.getSubject();
			if (subject.isAuthenticated()) {
				return R.error("请勿重复登陆");
			}
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			subject.login(token);
	        
		}catch (UnknownAccountException e) {
			return R.error(e.getMessage());
		}catch (IncorrectCredentialsException e) {
			return R.error("账号或密码不正确");
		}catch (LockedAccountException e) {
			return R.error("账号已被锁定,请联系管理员");
		}catch (AuthenticationException e) {
			return R.error("账户验证失败");
		}
	    
		return R.ok();
	}
	
	/**
	 * 退出
	 */
	@GetMapping("/logout")
	@ResponseBody
	public R logout() {
		ShiroUtils.logout();
		return R.ok();
	}
	
	
	
}

