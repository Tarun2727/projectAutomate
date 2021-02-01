package DropDown;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDups {
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
         
         List<WebElement> options = dropdown.getOptions();
         HashSet<String> h1=new HashSet<String>();
         for(WebElement we:options)
         {
        	String texts = we.getText();
        	h1.add(texts);
         }
         for(Object ob:h1)
         {
        	 System.out.println(ob);
         }
         
       
	}
}