package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestng {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title+"TITLE OF WEBPAGE");
	}
	@Test
	public void googleSearchBoxTest()
	{
		driver.findElement(By.name("q")).sendKeys("testnotatiom");
		System.out.println("done");
	}
	@Test
	public void feelingLuckyButtonTest()
	{
		driver.findElement(By.xpath("(//input[@class='RNmpXc' ])[2]")).click();
		
	}

}
