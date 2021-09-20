package com.orange.pagetest;

 

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orange.base.orangeBase;
import com.orange.pages.homePage;
import com.orange.pages.loginPage;

 

public class homePageTest extends orangeBase {
    ExtentSparkReporter reporter;
    ExtentReports extent;

 

    loginPage loginpage;
    homePage homepage;
    
    public homePageTest() throws Exception
    {
        super();
    }
    @BeforeMethod
    public void setUp() throws Exception
    {
        initialization();
        loginpage = new loginPage();
        homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void orangelogoTest() 
    {
        Assert.assertTrue(homepage.IslogoDisplay());
        System.out.println("Hello1");
    }
    
    
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

 

}