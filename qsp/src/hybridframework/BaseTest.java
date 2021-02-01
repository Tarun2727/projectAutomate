package hybridframework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyworddrivernFrame.ReadProperty;

public class BaseTest implements IAutoConsts {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		ReadProperty browser=new ReadProperty();
		String broval = browser.getProperty(Prop_Path, "browser");
		String urlval = browser.getProperty(Prop_Path, "url");
		if(broval.equals("chrome"))
		{
			System.setProperty(Chrome_Key,Chrome_Path);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(urlval);
		}
		else if(broval.equals("firfox"))
		{
			System.setProperty(Gecko_Key, Gecko_Path);
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
