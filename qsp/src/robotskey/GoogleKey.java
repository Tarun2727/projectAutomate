package robotskey;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleKey {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		 WebElement target1 = driver.findElement(By.name("q"));
		target1.sendKeys("samsung",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.name("q")).clear();
		Actions act=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//span[contains(.,'Multinational')]"));
		//act.moveToElement(target).perform();
		Thread.sleep(3000);
		act.doubleClick(target).perform();
		Thread.sleep(4000);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    //target1.clear();
	    Thread.sleep(4000);
	    act.contextClick(driver.findElement(By.name("q"))).perform();
	    for(int i=1;i<=6;i++)
	    {
	    	 r.keyPress(KeyEvent.VK_DOWN);
	 	    r.keyRelease(KeyEvent.VK_DOWN);
	    	
	    }
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.name("q")).click();
	   
	    
	    
	   
		
	}

}
