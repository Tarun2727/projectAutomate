package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotationCase5 {
	@Test
	  public void b()
	  {
		  Reporter.log("THIS IS METHOD B",true);
	  }
	@Test
	  public void z()
	  {
		  Reporter.log("THIS IS METHOD Z",true);
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
}
