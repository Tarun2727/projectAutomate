package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDD {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com");
         Thread.sleep(7000);
         driver.findElement(By.name("q")).sendKeys("bike");
         Thread.sleep(8000);
         List<WebElement>sugg = driver.findElements(By.xpath("//div[@class='sbl1']/span"));
         for(WebElement we:sugg)
         {
        	 System.out.println(we.getText());
         }

	}

}
