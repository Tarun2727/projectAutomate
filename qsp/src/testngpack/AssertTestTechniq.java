package testngpack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestTechniq {
	SoftAssert softass=new SoftAssert();
	  @Test
  public void testingWithAssert() {
	  System.out.println("open the browser");
	 Assert.assertEquals(true, true);// this is hard Assert Condition of saying that browser is not opened //hard assert will stop the futher excution if 
	 //it will not become equal //at first we have give expected as false to test whether the hard assert is working or not
	 
	 System.out.println("enter the username");
	 System.out.println("enter the password");
	 System.out.println("click on the login button");
	 
	 Assert.assertEquals(true, true);//this is hard Assert condition of saying the login page is not working//hard assert will stop the futher excution if 
	 //it will not become equal
	  
	 System.out.println("verify thwe title of home page");//like this condition is like minor bugs will not affect the futher process
	 softass.assertEquals(true, false);// this is soft assert condition it wont affect the futher process bt at last it will give exception
	 
	 System.out.println("go to user page");
	 System.out.println("create user");
	 
	 softass.assertEquals(true, false);
	 
	 
	 System.out.println("go to report page");
	 System.out.println("create report");
	 
	 softass.assertEquals(true, false);//for all the soft assert we need to call one method at the last
	 
	 softass.assertAll();//this is mandotory method for soft assert which is always the last statement in the testscripts.if we failed to define this 
	 //all the softassert wont give exception
	 
	 
	 
	 
  }
}
