package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStA {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.Bluestone.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text' and @name='search_query']")).sendKeys("Rings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit_search' and @value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block' and @alt='The Margo Ring']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='Not sure about the ring size?']")).click();
		//driver.findElement(By.xpath("//a[@id='ringSizeHelpText' and text()='Not sure about the ring size?']")).click();
	    //driver.findElement(By.xpath("//a[@id='ringSizeHelpText' and @href='#size-helper']")).click();
	     //driver.findElement(By.className("fancybox-popup")).click();
	      //driver.findElement(By.className("ring-size-pd inline-block")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ring-size-pd inline-block')]")).click();
		
		

	}

}
