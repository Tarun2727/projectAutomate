package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkA {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		/*driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(1000);*/
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Laptops",Keys.ENTER);
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//div[.='HP 14s Core i3 10th Gen - (8 GB/256 GB SSD/Windows 10 Home) 14s-cf3074TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_3tbKJL']/descendant::div[@class='_25b18c']/div")).getText();
		System.out.println("price of selected item"+price);
		Thread.sleep(1000);
		String rating=driver.findElement(By.xpath("//div[.='HP 14s Core i3 10th Gen - (8 GB/256 GB SSD/Windows 10 Home) 14s-cf3074TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='gUuXy-']/descendant::span[@class='_2_R_DZ']/descendant::span")).getText();
        System.out.println(rating);
  	}

}
