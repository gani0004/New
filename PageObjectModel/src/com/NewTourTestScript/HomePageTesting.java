package com.NewTourTestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.NewTourLibrary.WelcomeMercuryTours;

public class HomePageTesting extends BaseTest{

	@Test
	public void HomePageTest() throws IOException
	{
		WelcomeMercuryTours wmt=PageFactory.initElements(driver, WelcomeMercuryTours.class);
		wmt.Signon();
		driver.navigate().back();
		wmt.register();
		driver.navigate().back();
		
		FileInputStream file=new FileInputStream("./src/com/AppData/LoginDataq.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int RowCount=sheet.getLastRowNum();
		for(int i=0;i<=RowCount;i++)
		{
			Row r=sheet.getRow(i);
			wmt.login(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
			String exceptd="Find";
			String Actual=driver.getTitle();
			if(Actual.contains(exceptd)) {
				System.out.println("Login successful -PASS");
				r.createCell(2).setCellValue("Login successful -PASS");
			}else {
				System.out.println("Login failed- FAIL");
				r.createCell(2).setCellValue("Login failed- FAIL");
			}
			FileOutputStream file1=new FileOutputStream("./src/com/AppDataResult/LoginResult.xlsx");
			workbook.write(file1);
			driver.navigate().back();
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
