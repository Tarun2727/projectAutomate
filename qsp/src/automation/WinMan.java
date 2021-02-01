package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinMan {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(5000);
	   driver.manage().window().maximize();
	   Thread.sleep(5000);
	   driver.manage().window().fullscreen();
	   Thread.sleep(5000);
       Dimension ds=new Dimension(600,400);	   
	   driver.manage().window().setSize(ds);
	   Thread.sleep(5000);
	   Point p=new Point(400,600);
	   driver.manage().window().setPosition(p);
	   Thread.sleep(4000);
	   driver.close();
	}

}
