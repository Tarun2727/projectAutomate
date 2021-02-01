package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class SnapTake {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//explicit type cast
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);//for taking screenshot 
		File dest = new File("./ScreenShots/googless.png");//for deciding its path
		Files.copy(src, dest);//copy that ss from src to dest and this all file class and third party Files will give ioexception
		Thread.sleep(4000);
		
		//by downcast to remote web driver
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		File src1 = rwd.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShots/googless1.png");
		Files.copy(src1, dest1);
		
		
		//by using eventfiringwebdriver class
		EventFiringWebDriver ed = new EventFiringWebDriver(driver);
		File sr2 = ed.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./ScreenShots/google3.png");
		Files.copy(sr2, dest2);
		
		
		
	}

}
