package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("Admin123");
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//driver.close();
	
	}

}
