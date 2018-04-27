package com.persistent.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

public class WHomePage {
	//FirstMenu
	public static By Post= new By.ByXPath(".//*[@id='menu-posts']/a");
	public static By MediaMenu = new By.ByXPath("//*[@id='menu-media']/a");
	public static By  Links   = new By.ByXPath(".//*[@id='menu-links']/a");
	public static By Pages = new By.ByXPath(".//*[@id='menu-pages']/a");
	public static By Comments = new By.ByXPath(".//*[@id='menu-comments']/a");
	//Second Menu
	public static By Appearance = new By.ByXPath(".//*[@id='menu-appearance']/a");
	public static By Plugins = new By.ByXPath(".//*[@id='menu-plugins']/a");
	public static By Users = new By.ByXPath(".//*[@id='menu-users']/a");
	public static By Tools = new By.ByXPath(".//*[@id='menu-tools']/a");
	public static By Settings = new By.ByXPath(".//*[@id='menu-settings']/a");
	
 
}
