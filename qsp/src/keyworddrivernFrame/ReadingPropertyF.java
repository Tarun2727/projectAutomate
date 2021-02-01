package keyworddrivernFrame;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingPropertyF {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		ReadProperty browser=new ReadProperty();
		String broval = browser.getProperty("./data/config.properties", "browser");
		String urlval = browser.getProperty("./data/config.properties","url");
		if(broval.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(urlval);
			
		}
		else if(broval.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(urlval);
		}
		else
		{
			System.out.println("invalid browser");
		}
	
	}
	public void closeBrowser()
	{
		driver.close();
	}

}
