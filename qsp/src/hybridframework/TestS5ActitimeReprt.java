package hybridframework;

import java.io.IOException;

public class TestS5ActitimeReprt extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(3000);
		Flib ff = new Flib();
		String user = ff.readProperty(Prop_Path,"un");
		String pass = ff.readProperty(Prop_Path,"psw");
		
		 ActitimeLoginP lp = new ActitimeLoginP(driver);
		 lp.loginProcess(user, pass);
		 Thread.sleep(9000);
		 ActitimeReprtPage ar = new ActitimeReprtPage(driver);
		 ar.clickOnReports();
		 Thread.sleep(2000);
		 ar.clickOnNewRepo();
		 Thread.sleep(5000);
		 ar.clickOnConfigureButton();
		 
		  

	}

}
