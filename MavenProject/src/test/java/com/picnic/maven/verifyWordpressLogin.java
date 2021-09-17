package com.picnic.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.picnic.maven.*;
 
/**
* @author Mukesh_50
*
*/
public class verifyWordpressLogin 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopalakrishnanjm\\eclipse-workspace-seleniumTraining\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	LoginPage login=new LoginPage(driver);
	 
	Thread.sleep(3000);
	login.loginToWordpress("Admin","admin123");
	Thread.sleep(5000);
	//login.typePassword("admin123");
	//Thread.sleep(3000);
	//login.clickOnLoginButton();
	//Thread.sleep(3000);
 
 
	driver.quit();
 
}
 
 
}