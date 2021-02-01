package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filename {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/filename.html");
		Thread.sleep(4000);
		
		driver.findElement(By.id("i1")).sendKeys("gsadugasdugasdd");
		
		Thread.sleep(8000);
		driver.findElement(By.id("i2")).sendKeys("12321312");

	}

}
