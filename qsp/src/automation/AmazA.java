package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazA {
static
    {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.Amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("earbuds",Keys.ENTER);
		Thread.sleep(2000);
		String price=driver.findElement(By.xpath("//span[.='Noise Shots Nuvo Wireless Bluetooth Earbuds Designed for Music Lovers, Supports Fast Charging with 32 Hours of Total Playback time, IPX4 Water Resistant (ICY Grey)']/ancestor::div[@class='sg-col-inner'][2]/descendant::span[@class='a-price-whole']")).getText();
		System.out.println(price);
		String rate=driver.findElement(By.xpath("//span[.='Noise Shots Nuvo Wireless Bluetooth Earbuds Designed for Music Lovers, Supports Fast Charging with 32 Hours of Total Playback time, IPX4 Water Resistant (ICY Grey)']/ancestor::div[@class='sg-col-inner'][2]/descendant::div[@class='a-section a-spacing-none a-spacing-top-micro'][1]/descendant::span[@class='a-size-base']")).getText();
		System.out.println(rate);
		

	}

}
