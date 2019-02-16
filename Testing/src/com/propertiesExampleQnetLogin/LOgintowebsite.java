package com.propertiesExampleQnetLogin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LOgintowebsite extends BaseTest {

	@Test
	public void FbLogin() throws IOException
	{
		FileInputStream file=new FileInputStream("./src/com/ExcelFiles/LoginDataq.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++)//for getting row
		{
			Row r=sheet.getRow(i);
			//To get properties from properties file
			FileInputStream file2=new FileInputStream("E:\\Automation\\SeleniumAUT\\Testing\\QnetLogin.properties");
			Properties pr=new Properties();
			pr.load(file2);
			
			driver.findElement(By.id(pr.getProperty("IR"))).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id(pr.getProperty("Pass"))).sendKeys(r.getCell(1).getStringCellValue());;
			driver.findElement(By.id(pr.getProperty("SignIn"))).click();
			
			String expected="QNET India";
			String Actual=driver.getTitle();
			if(Actual.equals(expected))
			{
				System.out.println("Login Successful_PASS");
				r.createCell(2).setCellValue("Login Successful_PASS");
			}else {
				System.out.println("Login Failed_FAIL");
				r.createCell(2).setCellValue("Login Failed_FAIL");
			}
			FileOutputStream file1=new FileOutputStream("./src/com/ExcelFiles/LoginResult1.xlsx");
			workbook.write(file1);
			driver.navigate().back();
		}
	}
}
