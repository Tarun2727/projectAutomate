package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotationCase2 {
	@Test(priority = 3)
	  public void b()
	  {
		  Reporter.log("THIS IS METHOD B",true);
	  }
	@Test(priority = 1)
	  public void a()
	  {
		  Reporter.log("THIS IS METHOD A",true);
	  }
	@Test(priority = 4)
	  public void c()
	  {
		  Reporter.log("THIS IS METHOD C",true);
	  }
	@Test(priority = 2)
	  public void z()
	  {
		  Reporter.log("THIS IS METHOD Z",true);
	  }
  
}
