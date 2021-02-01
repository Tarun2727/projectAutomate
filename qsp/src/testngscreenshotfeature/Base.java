package testngscreenshotfeature;

import java.awt.Component;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base { //this  class is use to have generic method  to open the browser and url and taking screenshot method 
	static WebDriver driver;
	public static void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	
	public void failed(String methodName)
	{
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./TestNGScreenshot/"+methodName+".png");
		Files.copy(src, dest);
		}
		
		catch (IOException e) {
			// TODO: handle exception
		}
	}
	
}
