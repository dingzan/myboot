package com.dingzan.service;



public interface KylinHttpService {

	
	 String query(String requestBody);
	
	 String listQueryableTables(String projectName);
    
     String listCubes(int offset,int limit,String cubeName,String projectName );
    
     String getCubeDes(String cubeName);
    
     String getCube(String cubeName);
    
     String getDataModel(String modelName);
    
     String buildCube(String cubeName,String body);

     String enableCube(String cubeName);
    
     String disableCube(String cubeName);
    
     String purgeCube(String cubeName);
    
     String resumeJob(String jobId);
    
     String discardJob(String jobId);
    
     String getJobStatus(String jobId);
    
     String getJobStepOutput(String jobId,String stepId);
    
     String getHiveTable(String tableName);
    
     String getHiveTableInfo(String tableName);
    
     String getHiveTables(String projectName,boolean extOptional);
    
     String loadHiveTables(String tables,String project);
    
     String wipeCache(String type,String name,String action);
}
