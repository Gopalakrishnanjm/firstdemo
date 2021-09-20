package com.orange.base;

 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 

import com.orange.util.orangeUtil;

 


public class orangeBase {

 

    public static WebDriver driver;
    public static Properties prop;
    
    public orangeBase() throws Exception 
    {
        try
        {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\gopalakrishnanjm\\eclipse-workspace-MavenSelenium\\FreeTestApp\\src\\main\\java\\com\\orange\\config\\config.properties");
                                  // +"config\\config.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void initialization()
    {
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopalakrishnanjm\\eclipse-workspace-seleniumTraining\\SeleniumProject\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\gopalakrishnanjm\\eclipse-workspace-seleniumTraining\\SeleniumProject\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(orangeUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(orangeUtil.IMPLICITLY_TIMEOUT, TimeUnit.SECONDS);
        
        driver.get(prop.getProperty("url"));
    }
    
    
}