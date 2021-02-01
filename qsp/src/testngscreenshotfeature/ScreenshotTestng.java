package testngscreenshotfeature;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTestng extends Base { // this class is the actual testNG notations class or testscripts class.
	@BeforeMethod
	public void setUp()
	{
		initialize();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
	@Test// test case which will fail
    public void  VerifyTheLoginPageTitle()
    {
		String title = new WebDriverCommonLib().getTitleOfWebPage();
		Assert.assertEquals(title, "act - Login");
    }

}
