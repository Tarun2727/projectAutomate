package testngpack;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestForNotation {
  @Test
  public void a() {
	  Reporter.log("this is test notation",true);
  }
  @Test
  public void a1()
  {
	  Reporter.log("this is test1 notation",true);
  }
  @Test
  public void a2()
  {
	  Reporter.log("this is test2 notation",true);
  }
  @BeforeSuite
  public void b()
  {
	  Reporter.log("this is before suite notation",true);
	  
  }
  @AfterSuite
  public void c()
  {
	  Reporter.log("this is after suite notation",true);
  }
  
  @BeforeTest
  public void d()
  {
	  Reporter.log("this is before test notation",true);
	  
  }
  @AfterTest
  public void e()
  {
	  Reporter.log("this is after test notation",true);
  }
  @BeforeClass
  public void f()
  {
	  Reporter.log("this is before class notation",true);
  }
  @AfterClass
  public void g()
  {
	  Reporter.log("this is after class notation",true);
  }
  @BeforeMethod
  public void h()
  {
	  Reporter.log("this is before method notation",true);
  }
  @AfterMethod
  public void i()
  {
	  Reporter.log("this is after method notation",true);
  }
}
