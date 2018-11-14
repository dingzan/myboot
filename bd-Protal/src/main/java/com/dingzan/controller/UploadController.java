package com.dingzan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dingzan.utils.LayGridResult;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class UploadController {
	
	@Value("${upload.folder}") 
    private String uploadFolder ;

    @PostMapping("/upload")
    public LayGridResult singleFileUpload(MultipartFile file) {
    	
    	//创建返回值对象
    	LayGridResult result = null;
    	
    	if (!file.isEmpty()) { 
    		// 文件保存路径 
    		String filePath = uploadFolder + file.getOriginalFilename(); 
    		// 转存文件 
			try {
				file.transferTo(new File(filePath));
			} catch (IllegalStateException | IOException e) {
				return new LayGridResult(1, "上传异常");
			}
			result = new LayGridResult(0, "success");
			
    	}else{
    		result = new LayGridResult(1, "error");
    	}
    		
        return result;
    }

}