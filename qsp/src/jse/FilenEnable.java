package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilenEnable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/filename.html");
		Thread.sleep(4000);
		
		WebElement usern = driver.findElement(By.id("i1"));
		WebElement pass = driver.findElement(By.id("i2"));
		if(usern.isEnabled())
		{
			usern.sendKeys("afaawdawdawdwda");
		}
		else
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i1').value='sfdfada'");
		}
		if(pass.isEnabled())
		{
			pass.sendKeys("123213");
		}
		else
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='sfasdsa'");
		}

	}

}
