package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserOpenByXml {
WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void login(String browserValue)
	{
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    driver=	new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.google.com/");
		}
		
		
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		    driver.get("https://www.google.com/");
		}
		
		else
		{
			Reporter.log("invalid");
		}
		
		
		
	}
}
