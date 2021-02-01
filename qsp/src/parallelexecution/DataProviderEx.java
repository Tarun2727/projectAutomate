package parallelexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
  WebDriver driver;
  @BeforeMethod
  public void setup() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://online.actitime.com/tsalve/login.do");  
	  Thread.sleep(3000);
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
  @DataProvider(name = "TestInvalidData")
  public Object[][] getData()
  {
	  Object[][] data=new Object[3][2];
	  
	  data[0][0]="admin";
	  data[0][1]="manager123";
	  
	  data[1][0]="admin$123";
	  data[1][1]="manager123$123";
	  
	  data[2][0]="admin$123";
	  data[2][1]="manager123$123";
	  
	  return data;
	   
  }
  
  @Test(dataProvider = "TestInvalidData")
  public void loginTest(String usern,String passw) throws InterruptedException
  {
	  
	  driver.findElement(By.name("username")).sendKeys(usern);
	  Thread.sleep(1000);
	  driver.findElement(By.name("pwd")).sendKeys(passw);
	  Thread.sleep(1000);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(1000);
	  
  }
  
  
  
  
  
  
  
  
  
}
