package com.persistent.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private static String[][] data= null;
	private static FileInputStream input;
	private static  XSSFWorkbook wb = null;
	private static XSSFSheet sheet1 = null;
	
	public static String[][]  ReadExcel(String Sheetname, int row, int coll) throws IOException
	{
		
		File file1 = new File("D:\\Test_Automation\\WordP\\src\\test\\java\\TestData\\WordpressData.xlsx");
		
		
			 input = new FileInputStream(file1);
				wb = new XSSFWorkbook(input);
				sheet1 = wb.getSheet(Sheetname);
				//int rowcount = sheet1.getLastRowNum()+1;
				data = new String[row][coll];
				
				System.out.println(row + " " + coll);
				
				for(int i=1;i<row;i++)
				{
					
					for(int j =0; j<coll;j++)
					{
						System.out.println(i);
						System.out.println(j);
						
					 System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
					 
					 data[i][j] =sheet1.getRow(i).getCell(j).getStringCellValue();
					System.out.println("  the excel data is " +data.length);
					
					}
				//System.out.println(data.length);
				} 
		
		return data;
	
	}	


    public static void main(String[] args) throws IOException {
    	
    	//ReadExcel("LoginData");
	}
    
}