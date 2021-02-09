package testngpack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoSeleniumGrid {
	WebDriver driver;
	String nodeURL="http://192.168.42.243:4445/wb/hub";
	String baseURL="https://www.google.com";
	
	@BeforeMethod
	public void setUP() throws MalformedURLException {
	DesiredCapabilities capability=DesiredCapabilities.firefox();
	FirefoxOptions options=new FirefoxOptions();
	
	capability.setBrowserName("firefox");
	capability.setPlatform(Platform.WIN10);
	
	driver=new RemoteWebDriver(new URL(nodeURL), capability);

	} 
	
	
	
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test
	public void googleTest()
	{
		driver.get(baseURL);
		driver.switchTo().activeElement().sendKeys("selenium grid");
	}

}
