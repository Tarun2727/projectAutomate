package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelClass3 {
	WebDriver driver;
	@Test
	public void test3()
	{
		Reporter.log("this is test3",true);
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}


}
