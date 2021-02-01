package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMEx {
  @Test(dependsOnMethods = "logIn",alwaysRun = true)
  public void homePage() {
	  Reporter.log("home page is depend on login page",true);
	  
  }
  
  
  @Test(priority = 0,alwaysRun = true,description = "this method try to login to page")
  public void logIn() {
	  
	  //int n=9/0;   this will create exception and depended method will not excuted
	  Reporter.log("login method",true);
	  
  }
  @Test(priority = 2)
  public void logOut() {
	  Reporter.log("logout method",true); 
  }
  @Test
  public void a() {
	  Reporter.log("a method",true);
  }
  
}
