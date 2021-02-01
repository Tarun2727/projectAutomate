package jse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunc {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.selenium.dev/downloads/");
	     Thread.sleep(4000);
	     JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	     //for scroll down
	     jse1.executeScript("window.scrollBy(0,3000)");
	     Thread.sleep(4000);  
	     //for scroll up
	     jse1.executeScript("window.scrollBy(0,-3000)");
	     
	     

	}

}
