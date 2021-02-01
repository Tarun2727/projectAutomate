package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("asdadwadawdadawd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("ajsdasd");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		//driver.close();
	
	}

}
