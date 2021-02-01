package methoddrivenframe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScrip1ActiLoginValid {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Flib ff = new Flib();

		String urlval = ff.readProperty("./data/configformdf.properties","url");
		driver.get(urlval);
		ActitimeLoginpage lp = new ActitimeLoginpage(driver);
		lp.loginProcess(ff.readProperty("./data/configformdf.properties","un"),ff.readProperty("./data/configformdf.properties","psw"));
		
	}

}
