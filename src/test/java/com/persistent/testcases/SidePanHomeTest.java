package com.persistent.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.persistent.utility.ExcelUtil;
import com.persistent.utility.WSuitbase;

public class SidePanHomeTest extends WSuitbase {
	
	
	public static String[][] exceldata = new String[6][1];
	public static ArrayList<String> excelarrayA = new ArrayList<String>();
	
	@SuppressWarnings("static-access")
	@Parameters("HomeSidePaneT")
	@Test(enabled =true)
	public void homeFirstSidePaneTest(String SheetName)
	{
		login.LoginAction("admin", "demo123");
		
		common.waifor();
		
		//This method find menu from the home page and create one arraylist
		Whome.homeMenuList();
		
		//This method print the first menu list
		Whome.printlistA();
		
		//This method prints the second menu list
		Whome.printlistB();
		
		Whome.WordpressDataHomepaneA(SheetName);
		// List list1 = Arrays.asList(exceldata);
		 
		System.out.println(exceldata);
	
		// verifying all the menu items
		Whome.verifyPresentofMenu();
		
	}

/*	@Parameters("HomeSidePaneT")
	@DataProvider
	public String[][] WordpressDataHomepaneA(String Sheetname)
	   {
		  
				   try {
					exceldata = ExcelUtil.ReadExcel(Sheetname,6,1);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 
				   return exceldata;
		   
	   }
	*/


}
