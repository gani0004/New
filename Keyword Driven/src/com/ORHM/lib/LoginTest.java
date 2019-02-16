package com.ORHM.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.KeywordLiteral;

public class LoginTest {
	@Test
	public void Login() throws IOException {
		LoginkeyWords keys=new LoginkeyWords();//privious prog class object created
		FileInputStream file=new FileInputStream("./src/com/ExcelFileData/TestCaseORHM.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row r=null;
		int rowCount=sheet.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			 r=sheet.getRow(i);
			 String runmode=r.getCell(4).getStringCellValue();
			 if(runmode.equals("Y"))
			 {
				 String keyword=r.getCell(3).getStringCellValue();
				 if(keyword.equals("Launch_browser"))
				 {
					 keys.Launch_brower();
				 }
				 else if(keyword.equals("Navigate"))
				 {
					 keys.Navigate();
				 }
				 else if(keyword.equals("Enter_username"))
				 {
					 keys.Enter_username();
				 }
				 else if(keyword.equals("Enter_password"))
				 {
					 keys.Enter_password();
				 }
				 else if(keyword.equals("Login"))
				 {
					 keys.Login();
				 }
			 }
			 
			 
			 
			 
			 
		}
		
		
	}
	
	
}
