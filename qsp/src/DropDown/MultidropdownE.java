package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultidropdownE {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("file:///C:/Users/HP/Desktop/multidropdown.html");
         Thread.sleep(3000);
         WebElement target = driver.findElement(By.id("mobileDropdown"));
         Select dropdown=new Select(target);
         dropdown.selectByIndex(0);
         dropdown.selectByIndex(1);
         dropdown.selectByIndex(2);
         dropdown.selectByValue("i3");
         dropdown.selectByVisibleText("Iphone");
         Thread.sleep(5000);
         for(int i=0;i<=10;i++)
         {
        	 dropdown.selectByIndex(i); 
         }
         Thread.sleep(3000);
         dropdown.deselectAll();
         

	}

}
