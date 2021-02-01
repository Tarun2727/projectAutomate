package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCEx {
  @Test(invocationCount = 3)//if we want to excute one testcase multiple time we can take help of invocationcount
  public void a() {
	Reporter.log("method A",true);  
  }
  
  @Test(enabled = false)//if we want to disable any testcase we can take the help of enable/bydefault all testcase is enable and we can give true value as well
  public void b() {
	  Reporter.log("method B",true);
	  
	  
  }
  @Test
  public void c() {
	  Reporter.log("method C",true);
	  
  }
}
