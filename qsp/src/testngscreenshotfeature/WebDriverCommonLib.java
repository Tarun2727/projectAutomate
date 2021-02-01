package testngscreenshotfeature;

public class WebDriverCommonLib extends Base { //this class is used to have common webdriver method implemntattion
	
	public String getTitleOfWebPage()
	{
		String title = driver.getTitle();
		return title;
		
	}
	

}
