package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotationCase4 {
	@Test(priority = 2)
	  public void a()
	  {
		  Reporter.log("THIS IS METHOD A",true);
	  }
	@Test(priority = 2)
	  public void b()
	  {
		  Reporter.log("THIS IS METHOD B",true);
	  }
	@Test(priority = 0)
	  public void c()
	  {
		  Reporter.log("THIS IS METHOD C",true);
	  }
}
