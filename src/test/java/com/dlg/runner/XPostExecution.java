package com.dlg.runner;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.junit.Test;

public class XPostExecution {

	@Test
	public void test() throws Exception{
		File envFile = new File("./Resources/Temp/tempdata.txt");
		FileInputStream envFileIS = new FileInputStream(envFile);
		byte[] data = new byte[(int) envFile.length()];
		envFileIS.read(data);
		envFileIS.close();
		String fileData = new String(data, "UTF-8");
		fileData=fileData.replace("\n", "");
		fileData=fileData.replace("\r", "");
		envFile=new File("report.json");
		envFile.renameTo(new File(fileData+"/JSON/executionReport.json" ));
		Path path1 = FileSystems.getDefault().getPath("HTML_Reports");
		
		Path path2 = FileSystems.getDefault().getPath(fileData+"/HTML");
		Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING);	
	}
	

}
