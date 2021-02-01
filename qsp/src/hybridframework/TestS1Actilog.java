package hybridframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestS1Actilog extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib ff = new Flib();
		String urlval = ff.readProperty(Prop_Path,"url");
		driver.get(urlval);
		Thread.sleep(3000);
		String user = ff.readProperty(Prop_Path,"un");
		String pass = ff.readProperty(Prop_Path,"psw");
		
		 ActitimeLoginP lp = new ActitimeLoginP(driver);
		 lp.loginProcess(user, pass);
		
		
		
		
		

	}

}
