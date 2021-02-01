package hybridframework;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class TestS4ActiHomeLogo extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest1 bt1 = new BaseTest1();
		bt1.openBrowser();
		Thread.sleep(3000);
		Flib ff = new Flib();
		String user = ff.readProperty(Prop_Path,"un");
		String pass = ff.readProperty(Prop_Path,"psw");
		
		 ActitimeLoginP lp = new ActitimeLoginP(driver);
		 lp.loginProcess(user, pass);
		 Thread.sleep(9000);
		 ActitimeHomePage hp = new ActitimeHomePage(driver);
		 WebdriverCommanlib wb = new WebdriverCommanlib();
		hp.clickOnSettings();
			Thread.sleep(3000);
			hp.clickOnLogoSet();
			Thread.sleep(2000); 
			hp.clickOnRadioForUpload();
			Thread.sleep(9000);
			//hp.clickOnChooseFileButton();
			wb.mouseHover(hp.getChoosefilebutton());
			wb.doubleClick(hp.getChoosefilebutton());
			Thread.sleep(2000);
			wb.iAutoScriptForUploadPop();
			
			
		 
		 

	}

}
