package com.persistent.action;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.persistent.pages.WLoginPage;
import com.persistent.utility.ExcelUtil;
import com.persistent.utility.WSuitbase;

public class WLoginAction extends WSuitbase {
	
	
	
	public static void LoginAction(String UserName, String Pwd)
	{
		
	
		driver.findElement(WLoginPage.UserIDTest).sendKeys(UserName);
		driver.findElement(WLoginPage.UserPwd).sendKeys(Pwd);
		driver.findElement(WLoginPage.LoginButton).click();
	}
	

	
	


}