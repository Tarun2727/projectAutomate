package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexLoc {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.Google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'lapt')])")).click();
	}

}
