package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildpopHandle {

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
          Set<String> handles = driver.getWindowHandles();
          for(String wh:handles)
          {
        	  String title = driver.switchTo().window(wh).getTitle();
        	  if(!title.equals(parentTitle))
        	  {
        		  driver.switchTo().window(wh).close();
        		  
        	  }
          }
	}
}