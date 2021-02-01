package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement targetTillWeNeedToscroll = driver.findElement(By.xpath("//h2[contains(.,'Sponsors')]"));
		Point loc = targetTillWeNeedToscroll.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");

	}

}
