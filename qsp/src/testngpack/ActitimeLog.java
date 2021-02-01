package testngpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActitimeLog {
	WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public void actiTimeLog(String validuser,String validpass) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://online.actitime.com/tsalve/login.do");
	  driver.findElement(By.name("username")).sendKeys(validuser);
	  driver.findElement(By.name("pwd")).sendKeys(validpass);
	  driver.findElement(By.id("loginButton")).click();
	  
  }
}
