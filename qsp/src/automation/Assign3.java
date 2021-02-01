package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("tarun@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("tarun123333");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(3000);
		//driver.close();
	
	}

}
