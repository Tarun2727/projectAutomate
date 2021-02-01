package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpertionalMs {
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
        boolean chek = dropdown.isMultiple();
        if(chek)
        {
        	System.out.println("multi select");
        }
        else
        {
        	System.out.println("single select");
        }
        List<WebElement> optionswe = dropdown.getOptions();
        for(WebElement we:optionswe)
        {
        	System.out.println(we.getText());
        }
        System.out.println("-------------------------------------");
        
        for(int i=3;i<=7;i++)
        {
        	dropdown.selectByIndex(i);
        }
        List<WebElement> selectops = dropdown.getAllSelectedOptions();
        for(WebElement we:selectops)
        {
        	System.out.println(we.getText());
        }
        System.out.println("----------------------");
        WebElement firstselect = dropdown.getFirstSelectedOption();
        System.out.println("first selected"+firstselect.getText());
        System.out.println("-----------------");
        WebElement wrappede = dropdown.getWrappedElement();
        System.out.println(wrappede.getText());
        
        
        
    
         

	}

}