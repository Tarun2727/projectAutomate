package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSSD {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("file:///C:/Users/HP/Desktop/dropdownlist.html");
         Thread.sleep(3000);
         WebElement target = driver.findElement(By.id("i0"));
         Select dropdown=new Select(target);
         Thread.sleep(4000);
         dropdown.selectByIndex(4);
         Thread.sleep(4000);
         dropdown.selectByValue("i5");
         Thread.sleep(4000);
         dropdown.selectByVisibleText("vadapao");
         Thread.sleep(4000); 
         dropdown.deselectByIndex(4);
         
         
         

	}

}
