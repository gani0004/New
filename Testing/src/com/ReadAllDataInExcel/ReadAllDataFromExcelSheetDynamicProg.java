package com.ReadAllDataInExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllDataFromExcelSheetDynamicProg {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("./src/com/ExcelFiles/gani.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();//Count number of active rows
		for(int i=0;i<=rowCount;i++)//to get every active row
		{
			Row r=sheet.getRow(i);
			int cellCount=r.getLastCellNum();
			for(int k=0;k<cellCount;k++)
			{
				String data=r.getCell(k).getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}

	}

}
