
package com.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_data_provider {
	public static XSSFWorkbook wb;
	
	public excel_data_provider() throws Exception {
//		String path="C:\\Users\\P M\\Documents\\GitHub\\My_life\\data\\data1.xlsx";
	
		String path=System.getProperty("user.dir")+"\\data\\data1.xlsx";
		FileInputStream fis=new FileInputStream(path); 
		wb=new XSSFWorkbook(fis);
	}
	public String getstringdata(String sheetname,int row ,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public double getnumericdata(String sheetname,int row ,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	}
	

}
