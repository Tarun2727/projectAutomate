package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//it is used to open the webpage link on browser
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}
