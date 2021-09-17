

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopalakrishnanjm\\eclipse-workspace-seleniumTraining\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.findElements(By.xpath("//*[@id="customers"]/tbody/tr[2]/td[1]"));
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("The count of the row is : " +rowCount);
		
		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int y=2; y<=7; y++)
		{
			String actualXpath = beforeXpath+y+afterXpath;
			WebElement output = driver.findElement(By.xpath(actualXpath));
			System.out.println(output.getText());
			if (output.getText().equals("Ernst Handel"))
			{
				System.out.println("The value is "+output.getText()+" is found");
				break;
			}
			
		}
		String afterXpath2 = "]/td[2]";
		
		for(int y=2; y<=7; y++)
		{
			String actualXpath2 = beforeXpath+y+afterXpath2;
			WebElement output2 = driver.findElement(By.xpath(actualXpath2));
			System.out.println(output2.getText());
			if (output2.getText().equals("Ernst Handel"))
			{
				System.out.println("The value is "+output2.getText()+" is found");
				break;
			}
	}
String afterXpath3 = "]/td[3]";
		
		for(int y=2; y<=7; y++)
		{
			String actualXpath3 = beforeXpath+y+afterXpath3;
			WebElement output3 = driver.findElement(By.xpath(actualXpath3));
			System.out.println(output3.getText());
			if (output3.getText().equals("Ernst Handel"))
			{
				System.out.println("The value is "+output3.getText()+" is found");
				break;
			}

}}}
