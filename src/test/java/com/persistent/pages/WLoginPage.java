package com.persistent.pages;

import org.openqa.selenium.By;

public class WLoginPage {

	
public static By UserIDTest = new By.ByXPath(".//*[@id='user_login']");
	
	public static  By UserPwd = new By.ByXPath(".//*[@id='user_pass']");
	
	public static By LoginButton = new By.ByXPath(".//*[@id='wp-submit']");
	
}
