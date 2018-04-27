package com.persistent.utility;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.persistent.action.WHomeAction;
import com.persistent.action.WLoginAction;

public class WSuitbase {
	
	public static  CommonMethod  common = new  CommonMethod();
	
	public static WHomeAction Whome = new WHomeAction();
	
	public static WLoginAction login = new WLoginAction();
	
	public static WebDriver driver = null;	
	
	public static Actions act = null;
	
	public static Logger Log = Logger.getLogger(WSuitbase.class.getName());
	
	@BeforeTest
	@Parameters ({"BrowseType"})
	public void selectBrowser(String BrowseType)
	{
		DOMConfigurator.configure("log4j.xml");
		
	switch(BrowseType)
	{
	case "ff":
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 act = new Actions(driver);
		 System.out.println("My driver is  " +BrowseType);
		 Reporter.log("My driver is" +BrowseType);
		 Log.info("My driver is" +BrowseType);
		 driver.get("http://demosite.center/wordpress/wp-admin/");
		 
		break;
		
	case "chrome":
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 act = new Actions(driver);
	 System.out.println("My driver is" +BrowseType);
	 Reporter.log("My driver is" +BrowseType);
	 Log.info("My driver is" +BrowseType);
	 driver.get("http://demosite.center/wordpress/wp-admin/");
	break;
	
	case "ie":
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 act = new Actions(driver);
		 System.out.println("My driver is" +BrowseType);
		 Log.info("My driver is" +BrowseType);
		 Reporter.log("My driver is" +BrowseType);
		break;
		
	}

}
 
@AfterTest
public void testmethod()
{
	driver.close();
	driver.quit();

}


}
