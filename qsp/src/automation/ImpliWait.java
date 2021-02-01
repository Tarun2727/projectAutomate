package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliWait {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[.='Cart']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
		//click on login button
		//driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Login']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		//driver.close();
		
		
		

	}

}
