package keyworddrivernFrame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver driver;

	public void openBrowser() throws IOException, InterruptedException {
		ReadProperty browser=new ReadProperty();
		String broval = browser.getProperty("./data/config.properties", "browser");
		String urlval = browser.getProperty("./data/config.properties", "url");
		String username = browser.getProperty("./data/config.properties", "un");
		String password = browser.getProperty("./data/config.properties", "psw");
		if(broval.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(urlval);
			
			driver.findElement(By.name("txtUsername")).sendKeys(username);
			Thread.sleep(3000);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			Thread.sleep(3000);
			
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			
			
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
