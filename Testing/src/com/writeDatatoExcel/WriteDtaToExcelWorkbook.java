package com.writeDatatoExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDtaToExcelWorkbook {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("./src/com/ExcelFiles/Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Row r=sheet.createRow(2);
		Cell c=r.createCell(3);
		c.setCellValue("Gani");
        FileOutputStream file1=new FileOutputStream("./src/com/ExcelFiles/Book1.xlsx");
        workbook.write(file1);//to save the file
	}

}
