package DropDown;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseOrder {
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
        for(int i=options.size()-1;i>=0;i--)
        {
        	String texts = options.get(i).getText();
        	System.out.println(texts);
        }
        System.out.println("------------------------------------");
        Collections.reverse(options);
        for(WebElement we:options)
        {
        	System.out.println(we.getText());
        }
		

	}

}
