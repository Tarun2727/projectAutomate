package automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTP1 {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sca=new Scanner(System.in);
		System.out.println("enter the desired browser name to launch");
		String cb=sca.next();
		if(cb.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			//driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
			
			
		}
		else if(cb.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.close();
		}
		else
		{
			System.out.println("enter valid name");
		}
		

	}

}