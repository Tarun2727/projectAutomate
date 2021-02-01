package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLoc {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/WebELE.html");
		Thread.sleep(3000);
		driver.findElement(By.id("i2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("i3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("i4")).click();
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}

}