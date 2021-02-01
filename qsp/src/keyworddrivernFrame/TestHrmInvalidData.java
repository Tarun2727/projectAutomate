package keyworddrivernFrame;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestHrmInvalidData extends BaseTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	BaseTest1 bt = new BaseTest1();
	bt.openBrowser();
	Flib ff = new Flib();
	int rc = ff.getRowCount("./data/OrangHrmdata.xlsx", "InvalidData");
	for(int i=1;i<=rc-1;i++)
	{
		String user = ff.getCellData("./data/OrangHrmdata.xlsx", "InvalidData", i, 0);
		String pass = ff.getCellData("./data/OrangHrmdata.xlsx", "InvalidData", i, 1);
		driver.findElement(By.name("txtUsername")).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
	}
	bt.closeBrowser();
		

	}

}
