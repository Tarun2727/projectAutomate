package excelwriting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HrmCheckValid {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//it is used to launch the browser/or to open the browser
		WebDriver driver =new FirefoxDriver();
		//it is used to maximize the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Flib flib = new Flib();
		String username = flib.getCellData("./data/OrangHrmdata.xlsx", "ValidData", 1, 0);// generic reusable method reads the username data from the specified excel
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(3000);
		String password = flib.getCellData("./data/OrangHrmdata.xlsx", "ValidData", 1, 1);// generic reusable method reads the password data from the specified excel
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
}
