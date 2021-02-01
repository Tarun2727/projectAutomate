package methoddrivenframe;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScrip2ActiLoginInvalid {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Flib ff = new Flib();
		String urlval = ff.readProperty("./data/configformdf.properties", "url");
		int rc = ff.getRowCount("./data/actitimedata.xlsx", "invalidData");
		driver.get(urlval);
		ActitimeLoginpage lp = new ActitimeLoginpage(driver);
		for(int i=1;i<=rc-1;i++)
		{
			String user = ff.getCellData("./data/actitimedata.xlsx","invalidData", i, 0);
			String pass = ff.getCellData("./data/actitimedata.xlsx","invalidData", i, 1);
			lp.loginProcess(user, pass);
		}
		
		

	}

}
