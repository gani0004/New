package com.TestNGAnnoations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInFb extends BaseTest {//see same prog with properties in com.prppertiesEample....

	@Test
	public void FbLogin() throws IOException
	{
		FileInputStream file=new FileInputStream("./src/com/ExcelFiles/LoginData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++)//for getting row
		{
			Row r=sheet.getRow(i);
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTCO")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys(r.getCell(1).getStringCellValue());;
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnLogin")).click();
			
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
			FileOutputStream file1=new FileOutputStream("./src/com/ExcelFiles/LoginResult.xlsx");
			workbook.write(file1);
			driver.navigate().back();
		}
	}
}
