import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopalakrishnanjm\\eclipse-workspace-seleniumTraining\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.id("txtUsername"))).contextClick().build().perform();
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
	
		
		
		
	}
	

}
