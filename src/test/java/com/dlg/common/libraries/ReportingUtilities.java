package com.dlg.common.libraries;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class ReportingUtilities {
	private static File ReportFolder;
	public ReportingUtilities(){
		try{
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy:HH-mm-ss");
			Date date = new Date();
			String[] timeArr=dateFormat.format(date).split(":");
			ReportFolder=new File("./Reports/"+timeArr[0]+"/"+timeArr[1]);
			File reportFolders = new File("./Reports/"+timeArr[0]+"/"+timeArr[1]+"/JSON");
			reportFolders.mkdirs();
			reportFolders = new File("./Reports/"+timeArr[0]+"/"+timeArr[1]+"/HTML");
			reportFolders.mkdirs();
			reportFolders = new File("./Reports/"+timeArr[0]+"/"+timeArr[1]+"/Excel");
			reportFolders.mkdirs();
			reportFolders = new File("./Reports/"+timeArr[0]+"/"+timeArr[1]+"/Screenshots");
			reportFolders.mkdirs();
			PrintWriter writer = new PrintWriter("./Resources/Temp/tempdata.txt", "UTF-8");
			writer.println("./Reports/"+timeArr[0]+"/"+timeArr[1]);
			writer.close();
			
		} catch(Exception e){
			
		}		
	}
	public static void takeScreenShot(String path, WebDriver driver,Scenario scn, String step ) throws IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(path+"/"+ scn.getId().replace(";", "_")+"_"+step+"_"+new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date())+".png"));
		scn.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
	}
	
	public static File getReportFolder(){

		return ReportFolder;
	}
}
