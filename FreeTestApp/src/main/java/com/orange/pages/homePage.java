package com.orange.pages;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

import com.orange.base.orangeBase;

 

public class homePage extends orangeBase{

 

    @FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement OrangrHRMlogo;
    
//    @FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
//    WebElement OrangrHRMlogo;
    
    public homePage() throws Exception
    {
        PageFactory.initElements(driver, this);
    }
    
    public boolean IslogoDisplay()
    {
        return OrangrHRMlogo.isDisplayed();
    }

 

    //public void        
    }