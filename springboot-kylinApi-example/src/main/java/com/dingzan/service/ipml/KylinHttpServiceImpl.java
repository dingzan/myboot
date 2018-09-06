package com.dingzan.service.ipml;

import org.apache.axis.encoding.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dingzan.util.HttpClientUtil;
import com.dingzan.service.KylinHttpService;

@Service
public class KylinHttpServiceImpl implements KylinHttpService{
	
	@Value("$KYLIN.ACCOUNT")
	private String ACCOUNT ;
	
	@Value("$KYLIN.PWD")
	private String PWD ;
	
	@Value("$KYLIN.URL")
	private String KYLINURL;

	/**
	* base64加密密码
	* @return
	*/
	private String authCode(){
		String auth = ACCOUNT + ":" + PWD;
		new Base64();
		String code = "Basic "+new String(Base64.encode(auth.getBytes()));
		return code;
	}
	
 	
	/**
	 * kylin/api/query
	 * @param requestBody
     * sql - required string The text of sql statement.
     * offset - optional int Query offset. If offset is set in sql, curIndex will be ignored.
     * limit - optional int Query limit. If limit is set in sql, perPage will be ignored.
     * acceptPartial - optional bool Whether accept a partial result or not, default be “false”. Set to “false” for production use.
     * project - optional string Project to perform query. Default value is ‘DEFAULT’.
	 * @return
	 */
	public  String query(String requestBody){
		 String url = KYLINURL+"/query";
	     return HttpClientUtil.httpPost(url, requestBody, authCode());
	     
	}
	
	public  String listQueryableTables(String projectName){
		
        String url = KYLINURL+ "/tables_and_columns?project="+projectName;
        return  HttpClientUtil.httpGet(url,authCode());
    }
    
    
    /**
     * 查询cube列表
     * @param offset required int Offset used by pagination
     * @param limit required int Cubes per page.
     * @param cubeName optional string Keyword for cube names. To find cubes whose name contains this keyword.
     * @param projectName optional string Project name.
     * @return
     */
    public  String listCubes(int offset,
                                   int limit,
                                   String cubeName,
                                   String projectName ){
        
        String url = KYLINURL+ "/cubes?offset="+offset
                            +"&limit="+limit
                            +"&cubeName="+cubeName
                            +"&projectName="+projectName;
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    
    /**
     * 查询cube详情
     * @param cubeName  Cube name.
     * @return
     */
    public  String getCubeDes(String cubeName){
        
        String url = KYLINURL+ "/cube_desc/"+cubeName;
        return HttpClientUtil.httpGet(url,authCode()); 
        
    }
    
    
    /**
     * 查询cube信息
     * @param cubeName
     * @return
     */
    public  String getCube(String cubeName){
        
        String url = KYLINURL+ "/cubes/"+cubeName;
        return HttpClientUtil.httpGet(url,authCode()); 
        
    }
    
    
    /**
     * 查询cube模型
     * @param modelName Data model name, by default it should be the same with cube name.
     * @return
     */
    public  String getDataModel(String modelName){
        
        String url = KYLINURL+ "/model/"+modelName;
        return HttpClientUtil.httpGet(url,authCode());  
    }
    
    /**
     * 构建cube
     * startTime - required long Start timestamp of data to build, e.g. 1388563200000 for 2014-1-1
     * endTime - required long End timestamp of data to build
     * buildType - required string Supported build type: ‘BUILD’, ‘MERGE’, ‘REFRESH’
     * @param cubeName  Cube name.
     * @return
     */
    public String buildCube(String cubeName,String body){
    	
        String url = KYLINURL+ "/cubes/"+cubeName+"/build";
        
        return HttpClientUtil.httpPut(url,body,authCode()); 
    }

    /**
     *  启用cube
     * @param cubeName cubeName Cube name.
     * @return
     */
    public  String enableCube(String cubeName){
        
        String url = KYLINURL+ "/cubes/"+cubeName+"/enable";
        return HttpClientUtil.httpPut(url,null,authCode()); 
        
    }
    
    /**
     * 禁用cube
     * @param cubeName Cube name.
     * @return
     */
    public  String disableCube(String cubeName){
        
        String url = KYLINURL+ "/cubes/"+cubeName+"/disable";
        return HttpClientUtil.httpPut(url,null,authCode()); 
    }
    
    /**
     * 暂停cube
     * @param cubeName Cube name.
     * @return
     */
    public  String purgeCube(String cubeName){

        String url = KYLINURL+ "/cubes/"+cubeName+"/purge";
        return HttpClientUtil.httpPut(url,null,authCode()); 
    }
    
    
    /**
     * @param jobId Job id
     * @return
     */
    public  String resumeJob(String jobId){

        String url = KYLINURL+ "/jobs/"+jobId+"/resume";
        return HttpClientUtil.httpPut(url,null,authCode()); 
    }
    
    /**
     * @param jobId  Job id.
     * @return
     */
    public  String discardJob(String jobId){

        String url = KYLINURL+ "/jobs/"+jobId+"/cancel";
        return HttpClientUtil.httpPut(url,null,authCode()); 
    }
    
    /**
     * 
     * @param jobId  Job id.
     * @return
     */
    public  String getJobStatus(String jobId){

        String url = KYLINURL+ "/jobs/"+jobId;
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    
    /**
     * @param jobId Job id.
     * @param stepId  Step id; the step id is composed by jobId with step sequence id; 
     * for example, the jobId is “fb479e54-837f-49a2-b457-651fc50be110”, its 3rd step id 
     * is “fb479e54-837f-49a2-b457-651fc50be110-3”,
     * @return
     */
    public  String getJobStepOutput(String jobId,String stepId){
        
        String url = KYLINURL+ "/"+jobId+"/steps/"+stepId+"/output";
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    
    /**
     * @param tableName table name to find.
     * @return
     */
    public  String getHiveTable(String tableName){
        
        String url = KYLINURL+ "/tables/"+tableName;
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    
    /**
     * 
     * @param tableName  table name to find.
     * @return
     */
    public  String getHiveTableInfo(String tableName){
        
        String url = KYLINURL+ "/tables/"+tableName+"/exd-map";
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    

    /**
     * 
     * @param projectName will list all tables in the project.
     * @param extOptional boolean set true to get extend info of table.
     * @return
     */
    public  String getHiveTables(String projectName,boolean extOptional){
        
        String url = KYLINURL+ "/tables?project="+projectName+"&ext="+extOptional;
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    
    
    /**
     * 
     * @param tables  table names you want to load from hive, separated with comma.
     * @param project the project which the tables will be loaded into.
     * @return
     */
    public  String loadHiveTables(String tables,String project){
        String url = KYLINURL+ "/tables/"+tables+"/"+project;
        return HttpClientUtil.httpGet(url,authCode()); 
    }
    
    /**
     * 
     * @param type ‘METADATA’ or ‘CUBE’
     * @param name  Cache key, e.g the cube name.
     * @param action ‘create’, ‘update’ or ‘drop’
     * @return
     */
    public  String wipeCache(String type,String name,String action){
        String url = KYLINURL+ "/cache/"+type+"/"+name+"/"+action;
        return HttpClientUtil.httpGet(url,authCode()); 
    }

}
