package com.dingzan.kylin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.apache.axis.encoding.Base64;

/**
 * kylin查询
 * @author dingzan
 *
 */
@Component
public class KylinQuery {
	
	private String encoding = "UTF-8";
	
	@Value("$KYLIN.ACCOUNT")
	private String ACCOUNT ;
	
	@Value("$KYLIN.PWD")
	private String PWD ;
	
	@Value("$KYLIN.URL")
	private String KYLINURL;
	
	public  String requestByGetMethod(String para,String method,String body){
		    
	        StringBuilder out = new StringBuilder();
	        try {
	            URL url = new URL(KYLINURL+para);        
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod(method);   
	            connection.setDoOutput(true);
	            connection.setRequestProperty  ("Authorization", "Basic " + this.authCode());
	            connection.setRequestProperty("Content-Type","application/json");         
	            if(body !=null){
	                byte[] outputInBytes = body.getBytes("UTF-8");
	                OutputStream os = connection.getOutputStream();
	                os.write(outputInBytes);    
	                os.close();
	            }
	            InputStream content = (InputStream)connection.getInputStream();  
	            BufferedReader in  = new BufferedReader (new InputStreamReader (content)); 
	            String line;
	            while ((line = in.readLine()) != null) {
	                out.append(line);
	            }
	            in.close();
	            connection.disconnect();
	            
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	        return out.toString();
	    }
	 
	/**
	* 发送http post请求  
	*/
	public String requestByPostMethod(String requestBody){
		String result = "";
		//since 4.3 不再使用 DefaultHttpClient    
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		try {
			//创建post方式请求对象
			String url =KYLINURL+"/query";
			HttpPost httpPost = new HttpPost(url);
			//请求参数
			StringEntity sentity = new StringEntity(requestBody,encoding);//解决中文乱码问题
			sentity.setContentEncoding(encoding);
			sentity.setContentType("application/json");
			httpPost.setEntity(sentity);
			//请求header
			//指定报文头【Content-type】、【User-Agent】
			httpPost.setHeader("Content-type", "application/json;charset=utf-8");
			httpPost.setHeader("Authorization", this.authCode());
			System.out.println("POST 请求...." + httpPost.getURI());
			//执行请求
			CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
			try{
				HttpEntity entity = httpResponse.getEntity();
				if (null != entity){
					//按指定编码转换结果实体为String类型
					result = EntityUtils.toString(entity, encoding);
				}
			} finally{
				httpResponse.close();
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	/**
	* kylin 是base64加密的，访问时候需要加上加密码
	* @return
	*/
	private String authCode(){
		String auth = ACCOUNT + ":" + PWD;
		new Base64();
		String code = "Basic "+new String(Base64.encode(auth.getBytes()));
		return code;
	}

		
}
