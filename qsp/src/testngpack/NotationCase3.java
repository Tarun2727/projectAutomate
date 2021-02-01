package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotationCase3 {
	@Test(priority = 3)
	  public void b()
	  {
		  Reporter.log("THIS IS METHOD B",true);
	  }
	@Test(priority = 2)
	  public void a()
	  {
		  Reporter.log("THIS IS METHOD A",true);
	  }
	@Test(priority = 0)
	  public void c()
	  {
		  Reporter.log("THIS IS METHOD C",true);
	  }
	@Test(priority = 1)
	  public void k()
	  {
		  Reporter.log("THIS IS METHOD K",true);
	  }
}
