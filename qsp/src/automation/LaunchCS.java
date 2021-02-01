package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCS {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	    Thread.sleep(3000);
	    String Ti=driver.getTitle();
	    System.out.println(Ti);
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    String SC=driver.getPageSource();
	    System.out.println(SC);
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    String UR=driver.getCurrentUrl();
	    System.out.println(UR);
	    driver.quit();
	    

	}

}
