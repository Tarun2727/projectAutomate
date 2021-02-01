package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GropingTestCases {
   @Test(groups = "Fun")
   public void FT01()
   {
	   Reporter.log("functional 1",true);
   }
   @Test(groups = "Smo")
   public void SM01()
   {
	   Reporter.log("Smoke 1",true);
   }
   @Test(groups = "Int")
   public void IT01()
   {
	   Reporter.log("Integration 1",true);
   }
   ////////////////////
   @Test(groups = "Fun")
   public void FT02()
   {
	   Reporter.log("functional 2",true);
   }
   @Test(groups = "Smo")
   public void SM02()
   {
	   Reporter.log("Smoke 2",true);
   }
   @Test(groups = "Int")
   public void IT02()
   {
	   Reporter.log("Integration 2",true);
   }
   //////////////
   @Test(groups = "Fun")
   public void FT03()
   {
	   Reporter.log("functional 3",true);
   }
   @Test(groups = "Smo")
   public void SM03()
   {
	   Reporter.log("Smoke 3",true);
   }
   @Test(groups = "Int")
   public void IT03()
   {
	   Reporter.log("Integration 3",true);
   }
   ////////////////////
   @Test(groups = "Fun")
   public void FT04()
   {
	   Reporter.log("functional 4",true);
   }
   @Test(groups = "Smo")
   public void SM04()
   {
	   Reporter.log("Smoke 4",true);
   }
   @Test(groups = "Int")
   public void IT04()
   {
	   Reporter.log("Integration 4",true);
   }
}
