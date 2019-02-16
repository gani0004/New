package com.TestNGAnnoations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewUserRegistration extends BaseTest1
{
@Test(priority=0)
public void Register()
{
	driver.findElement(By.linkText("REGISTER")).click();
	
}
@Test(priority=1)
public void UserRegistration() throws IOException
{
	FileInputStream file=new FileInputStream("./src/com/ExcelFiles/NewTourRegistrastion data.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum();
	for(int i=1;i<=rowCount;i++)
	{
		Row r=sheet.getRow(i);
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		//Type Casting used because sendkeys allow only string so we convert number into string
		double d=r.getCell(2).getNumericCellValue();
		long l=(long)d;
		String phoneNumber=Long.toString(l);
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double dd=r.getCell(7).getNumericCellValue();
		long ll=(long)dd;
		String postalcode=Long.toString(ll);
		driver.findElement(By.name("postalCode")).sendKeys(postalcode);
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
	
		driver.findElement(By.name("register")).click();
	String excepted=r.getCell(9).getStringCellValue();
	String Actual=driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	if(Actual.contains(excepted))
	{
		System.out.println("Registration successful- Pass");
		r.createCell(12).setCellValue("Registration successful- Pass");
	}else
	{
		System.out.println("Registration Fail- Fail");
		r.createCell(12).setCellValue("Registration Fail- Fail");
	}
	FileOutputStream file1=new FileOutputStream(".//src/com/ExcelFiles/NewTourRegistrastion_Result.xlsx");
	workbook.write(file1);
	
	driver.navigate().refresh();//remove if not work
	driver.navigate().back();
	
	}
	
	
	
}
}
