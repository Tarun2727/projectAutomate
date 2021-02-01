package hybridframework;

import java.io.IOException;

public class TestS3ActiHomepage extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(3000);
		Flib ff = new Flib();
		String user = ff.readProperty(Prop_Path,"un");
		String pass = ff.readProperty(Prop_Path,"psw");
		
		 ActitimeLoginP lp = new ActitimeLoginP(driver);
		 lp.loginProcess(user, pass);
		 Thread.sleep(2000);
		ActitimeHomePage hp = new ActitimeHomePage(driver);
		hp.clickOnSettings();
		Thread.sleep(3000);
		hp.clickOnGeneralSettings();
		Thread.sleep(3000);
		WebdriverCommanlib wb = new WebdriverCommanlib();
		wb.dropdownOptions(hp.getFirstdropdown1());
		Thread.sleep(2000);
		wb.dropdownOptions(hp.getSeconnddropdown2());
		Thread.sleep(2000);
		wb.dropdownOptions(hp.getThirddropdown3());
		Thread.sleep(2000);
	
		
		
		

	}

}
