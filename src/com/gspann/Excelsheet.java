package com.gspann;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelsheet {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFCell cell;
	@Test (dataProvider ="myDP")
	public void test1(String s) {
		System.out.println("Value is " +s);
	}

	@DataProvider
	public Object[][] myDP(){
		Object[][] obj = null;
		try {
			fis = new FileInputStream("E:/mytest123.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		sheet = wb.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();           //this return index and not the autal count
		int totalCols = sheet.getRow(1).getLastCellNum();// this method returns the actual column number and not index
		obj = new Object[totalRows][totalCols];
		int startRow = 1;
		int startCol =0;
		int ci,cj; //denotes 2D array indexes
		ci=0;

		for(int i = startRow;i<=totalRows;i++,ci++){
			cj=0;
			for(int j=startCol; j<totalCols;j++,cj++){
				obj[ci][cj]= getData(i, j); //value from excel
			}
		} 	



		return obj;
	}

	public Object getData(int r,int c){
		cell = sheet.getRow(r).getCell(c);
		int type = cell.getCellType();
		if(type == 0){ // for integers type is 0
			return cell.getRawValue();
		}
		else if (type ==1) //for strings, type is 1
			return cell.getStringCellValue();


		else return null;


	}
}