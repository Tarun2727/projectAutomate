package jse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLR {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.craftsvilla.com/");
	     Thread.sleep(4000);
	     JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	     //scroll right
	     jse1.executeScript("window.scrollBy(200,0)");
	     Thread.sleep(4000);
	     //scroll left
	     jse1.executeScript("window.scrollBy(-200,0)");
	     

	}

}
