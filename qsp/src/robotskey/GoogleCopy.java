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

public class GoogleCopy {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		

		//it is used to launch the browser/or to open the browser
		WebDriver driver =new ChromeDriver();
		//it is used to maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(3000);
	   WebElement target = driver.findElement(By.xpath("//span[.='Programming language']"));
	    Actions act = new Actions(driver);
	    
	    
	    act.doubleClick(target).perform();
	    
	    
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		driver.findElement(By.name("q")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
		

}

}