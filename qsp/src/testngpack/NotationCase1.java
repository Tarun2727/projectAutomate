package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotationCase1 {
  @Test
  public void a() {
	  Reporter.log("THIS IS METHOD A",true);
  }
  @Test
  public void c()
  {
	  Reporter.log("THIS IS METHOD C",true);
  }
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
  @Test
  public void d()
  {
	  Reporter.log("THIS IS METHOD D",true);
  }
  
}
