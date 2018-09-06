package com.dingzan.util;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {
	
	private static String encoding = "UTF-8";
	

	/**  
     * 发送http get请求  
     */    
    public static String httpGet(String url,String authCode){    
        String result = "";    
        //since 4.3 不再使用 DefaultHttpClient    
        CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();     
        HttpGet httpGet = new HttpGet(url);    
        
        //设置header  
        //指定报文头【Content-type】、【User-Agent】
        httpGet.setHeader("Content-type", "application/json;charset=utf-8");
        httpGet.setHeader("Authorization", authCode);
        CloseableHttpResponse httpResponse = null;    
        
        try {
			httpResponse = closeableHttpClient.execute(httpGet);
			HttpEntity entity = httpResponse.getEntity();    
			result = EntityUtils.toString(entity, encoding); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpResponse.close();
				closeableHttpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}   
		return result;    
    }    
    
    /**
	* 发送http post请求  
	*/
	public static String httpPost(String url,String requestBody,String authCode){
		String result = "";
		//since 4.3 不再使用 DefaultHttpClient    
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		try {
			//创建post方式请求对象
			HttpPost httpPost = new HttpPost(url);
			//请求参数
			StringEntity sentity = new StringEntity(requestBody,encoding);//解决中文乱码问题
			sentity.setContentEncoding(encoding);
			sentity.setContentType("application/json");
			httpPost.setEntity(sentity);
			//请求header
			//指定报文头【Content-type】、【User-Agent】
			httpPost.setHeader("Content-type", "application/json;charset=utf-8");
			httpPost.setHeader("Authorization", authCode);
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
     * 发送 http put
     */    
    public  static String  httpPut(String url,String requestBody,String authCode){    

    	String result = "";
    	CloseableHttpClient closeableHttpClient = HttpClients.createDefault();     
        HttpPut httpput = new HttpPut(url);  
          
        //设置header  
        //指定报文头【Content-type】、【User-Agent】
        httpput.setHeader("Content-type", "application/json;charset=utf-8");
        httpput.setHeader("Authorization", authCode);
       
        //组织请求参数    
        if (StringUtils.isNotBlank(requestBody)) {
        	StringEntity sentity = new StringEntity(requestBody,encoding);//解决中文乱码问题
        	sentity.setContentEncoding(encoding);
        	sentity.setContentType("application/json");
        	httpput.setEntity(sentity);
		}
		
		CloseableHttpResponse httpResponse = null;   
        try {    
            //响应信息  
            httpResponse = closeableHttpClient.execute(httpput);    
            HttpEntity entity = httpResponse.getEntity();    
            result = EntityUtils.toString(entity, encoding);    
        } catch (Exception e) {    
            e.printStackTrace();    
        }finally{    
            try {    
            	//关闭连接、释放资源  
                httpResponse.close();    
                closeableHttpClient.close();    
            } catch (IOException e) {    
                e.printStackTrace();    
            }    
        }    
        return result;    
    }    
}
