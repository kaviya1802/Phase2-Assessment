package com.simplilearn.exceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	private static final String String = null;
	String filePath = "/home/nallakavi35gmai/Item details.xlsx";
	String sheetName = "Item";
	GetExcelDetails get = new GetExcelDetails();
	
	public void readExcelData() throws IOException {
		try {
			FileInputStream inputStream = new FileInputStream(filePath);
			XSSFWorkbook wBook = new XSSFWorkbook(inputStream);
			XSSFSheet wSheet = wBook.getSheet(sheetName);
			int startRow = 1;
			int totalRows = wSheet.getLastRowNum();
			
			for (int i=1; i<= totalRows; i++) {
				XSSFRow ROW = wSheet.getRow(i);
				
				XSSFCell cell_res = ROW.getCell(0);
				String restaurant = cell_res.getStringCellValue();
				
				XSSFCell cell_item = ROW.getCell(1);
				String item = cell_item.getStringCellValue();
				
				XSSFCell cell_qty = ROW.getCell(2);
				String quantity = cell_qty.getStringCellValue();
				
				get.getDetails(restaurant, item, quantity); 
				}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
