package com.persistent.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.persistent.action.*;
import com.persistent.action.WLoginAction;
import com.persistent.utility.ExcelUtil;

public class LoginTest {
	
	public static String[][] exceldata = new String[4][2];
	
	
	//This Method login to the application by suing given password and userid
	
	@Test(dataProvider = "WordpressData", enabled = false)
	public void SignTest(String UserName, String Pwd)
	{
		WLoginAction.LoginAction(UserName,Pwd);
		
	}
	@Parameters({"LoginSheet"})
	@DataProvider
	public String[][] WordpressData(String Sheetname)
	   {
		  
				   try {
					exceldata = ExcelUtil.ReadExcel(Sheetname, 4, 2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 
				   return exceldata;
		   
	   }
	

}
