package hybridframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiloginInvalidMDF extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib ff = new Flib();
		String urlval = ff.readProperty(Prop_Path,"url");
		driver.get(urlval);
		Thread.sleep(3000);
		int rc = ff.getRowCount(Excel_Path, "invalidData");
		ActitimeLoginP lp = new ActitimeLoginP(driver);
		for(int i=1;i<=rc-1;i++)
		{
			String user = ff.getCellData(Excel_Path, "invalidData", i, 0);
			String pass = ff.getCellData(Excel_Path, "invalidData", i, 1);
			Thread.sleep(3000);
			lp.loginProcess(user, pass);
			 
		}
		bt.closeBrowser();

	}

}
