import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertAll {
	
	
	//SoftAssert demo = new SoftAssert();
	
	@Test
	public void Test1()
	{
		SoftAssert demo = new SoftAssert();
		System.out.println("Login Feature");
		demo.assertEquals(true, false, "Our expected result will be ");
	
		
		System.out.println("Home Page feature");
		demo.assertAll();
	}

	@Test
	public void Test2()
	{
		SoftAssert demo1 = new SoftAssert();
		System.out.println("payment feature");
		demo1.assertEquals(true, false, "Our expected result will be ");
		demo1.assertAll();
	
		
		
	}
	
	
	
}
