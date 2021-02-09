package actitimetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActitimeTest {
WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testLogin()
	{
		driver.get("https://online.actitime.com/tsalve/login.do");
		String title = driver.getTitle();
		Assert.assertEquals(title, "actiTIME - Login");
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
