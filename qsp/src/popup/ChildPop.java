package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.naukri.com/");
          Thread.sleep(2000);   
           //driver.close(); this is used to close only parent browser
          //driver.quit();this is used to quit
          String parentHandle = driver.getWindowHandle();
          System.out.println(parentHandle);
          String parentTitle = driver.getTitle();
          System.out.println(parentTitle);
          System.out.println("------------------------------");
          Set<String> handles = driver.getWindowHandles();
          for(String wh:handles)
          {
        	  System.out.println(wh);
          }
          System.out.println("-----------------");
          //to close all the browser without using quit()
          Thread.sleep(3000);
          for(String wh:handles)
          {
        	  Thread.sleep(2000);
        	  driver.switchTo().window(wh).close();
          }
          
          
	}

}
