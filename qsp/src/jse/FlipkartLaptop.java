package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		 driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		 Thread.sleep(6000);
		 WebElement lap5 = driver.findElement(By.xpath("//div[text()='Lenovo Ideapad S145 Core i3 7th Gen - (4 GB/1 TB HDD/Windows 10 Home) S145-15IKB Laptop']"));
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		Point loc5 = lap5.getLocation();
		int x = loc5.getX();
		int y = loc5.getY();
		jse1.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		 String price = driver.findElement(By.xpath("//div[.='Lenovo Ideapad S145 Core i3 7th Gen - (4 GB/1 TB HDD/Windows 10 Home) S145-15IKB Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
         System.out.println("LAPTOPS PRICE IS --"+price);
		
		
	}

}
