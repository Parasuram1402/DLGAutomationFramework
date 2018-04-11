package com.dlg.common.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentVariablesHandler {
	private static Map<String,String> envVariablesMap;
	private final static String FILE_NAME = "./Resources/EnvironmentVariables/EnvironmentVariables.conf";
	public EnvironmentVariablesHandler(){
		try{
			envVariablesMap= new HashMap<String, String>();
			File envFile = new File(FILE_NAME);
			FileInputStream envFileIS = new FileInputStream(envFile);
			String[] confArray;
			byte[] data = new byte[(int) envFile.length()];
			envFileIS.read(data);
			envFileIS.close();
			String fileData = new String(data, "UTF-8");
			confArray=fileData.split("\n");
			for(int i=0;i<confArray.length;i++){
				String[] dataArr=confArray[i].split("=");
				dataArr[1]=dataArr[1].replace("\"", "");
				dataArr[1]=dataArr[1].replace("\r", "");
				envVariablesMap.put(dataArr[0],dataArr[1]);
			}
		} catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		
	}
	public static Map<String,String> getEnvironmentVariables(){
		return envVariablesMap;
	}
}
