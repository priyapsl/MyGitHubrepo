package com.persistent.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.persistent.pages.WHomePage;
import com.persistent.utility.CommonMethod;
import com.persistent.utility.ExcelUtil;
import com.persistent.utility.WSuitbase;

public class WHomeAction extends WSuitbase{
    //First Menu List
	 private  String Post;
	 private  String Media;
	 private  String Links;
	 private  String Pages;
	 private String Comments;
	 
	//Second Menu List
	 private String Appearance;
	 private String Plugins; 
	 private String Users;
	 private String Tools;
	 private String Settings;
	 
	public static List<String> Alist = new ArrayList<String>();
	 
	public static List<String> Blist = new ArrayList<String>();
	public static String[][] exceldata = new String[6][1];
	public static List<String> exellist = new ArrayList<String>();
	
	public  void homeMenuList()
	{
		Post = driver.findElement(WHomePage.Post).getText();
		Alist.add(Post);
		
		Media = driver.findElement(WHomePage.MediaMenu).getText();
		Alist.add(Media);
		
		Links = driver.findElement(WHomePage.Links).getText();
		Alist.add(Links);
		
		Pages = driver.findElement(WHomePage.Pages).getText();
		Alist.add(Pages);
		
		Comments = driver.findElement(WHomePage.Comments).getText();
		Alist.add(Comments);
		
		//Second MenuList
		Appearance = driver.findElement(WHomePage.Appearance).getText();
		Blist.add(Appearance);
		
		Plugins = driver.findElement(WHomePage.Plugins).getText();
		Blist.add(Plugins);
		
		Users = driver.findElement(WHomePage.Users).getText();
		Blist.add(Users);
		
		Tools = driver.findElement(WHomePage.Tools).getText();
		Blist.add(Tools);
		
		Settings = driver.findElement(WHomePage.Settings).getText();
		Blist.add(Settings);
	
	}
	
	//This method prints the elements from listA
	public  void printlistA()
	{
		common.toString(Alist);
		Log.info("List is Printed from first menu list");
		
	}

	//this method prints the elements from listB
     public  void printlistB()
     {
    	 common.toString(Blist);
    	 Log.info("The List is printed from second menu list");
     }

    //This method fetch data from the excel and convert array to list
     public void WordpressDataHomepaneA(String Sheetname)
	   {
		  
				   try {
					exceldata = ExcelUtil.ReadExcel(Sheetname,6,1);
					Log.info("Data fetched from the excelsheet aand stored in the 2d array");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Log.error("data failed to fetch from the excel sheet", e);
				}
			 int coll = 0;
			 for(int row=1;row<6;row++)
			 {
				exellist.add(exceldata[row][coll]);
				 
			 }
				   
			 common.toString(exellist);
	   }
     
     //This method verifies the presence of first panel menu if menu is not present then it will dipalys message and report it into log
     // if throws exception and catch also but makes test case fail again after logging it.
     
     public void verifyPresentofMenu()
     {
    	 
    	 for(int i=0;i<exellist.size();i++)
    	 {
    		 if(Alist.contains(exellist.get(i)))
    		 {
    			 System.out.println("The menu item "+exellist.get(i) + "  present on portal" );
    		 }
    		 else
    		 {
    		 System.out.println("The menu item "+exellist.get(i) + " is not present on portal" );
    		 }
    	 }
    	 
     }
}
