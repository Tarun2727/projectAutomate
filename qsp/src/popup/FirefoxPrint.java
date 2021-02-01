package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxPrint {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		Robot ro = new Robot();
		Thread.sleep(4000);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_P);
		ro.keyRelease(KeyEvent.VK_P);
  		ro.keyRelease(KeyEvent.VK_CONTROL);
           Thread.sleep(3000);
           File ff = new File("./autoiScis/printbutton.exe");
           String abs = ff.getAbsolutePath();
           Runtime.getRuntime().exec(abs);
           
           
           
           
           
           
           
           
          /* for(int i=0;i<10;i++)
           {
        	   ro.keyPress(KeyEvent.VK_TAB);
       		ro.keyRelease(KeyEvent.VK_TAB);
       		ro.keyPress(KeyEvent.VK_TAB);
       		ro.keyRelease(KeyEvent.VK_TAB);
       		Thread.sleep(2000);
        	   
           }
          // Thread.sleep(1000);
           ro.keyPress(KeyEvent.VK_ENTER);
   		   ro.keyRelease(KeyEvent.VK_ENTER);*/
	}   

}
