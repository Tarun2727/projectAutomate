package keyworddrivernFrame;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 {
static WebDriver driver;
	public void openBrowser() throws IOException
	{
		ReadProperty browser=new ReadProperty();
		String broval = browser.getProperty("./data/config.properties", "browser");
		String urlval = browser.getProperty("./data/config.properties", "url");
		if(broval.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(urlval);
		}
		else if(broval.equals("firfox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(urlval);
			
		}
		
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
