package hybridframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestS2ActiLogInvalid {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Flib ff = new Flib();
		String urlval = ff.readProperty("./data/configformdf.properties","url");
		driver.get(urlval);
		Thread.sleep(3000);
		int rc = ff.getRowCount("./data/actitimedata.xlsx", "invalidData");
		
		for(int i=1;i<=rc-1;i++)
		{
			String user = ff.getCellData("./data/actitimedata.xlsx", "invalidData", i, 0);
			String pass = ff.getCellData("./data/actitimedata.xlsx", "invalidData", i, 1);
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(user);
			Thread.sleep(2000);
	         driver.findElement(By.name("pwd")).sendKeys(pass);
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//div[.='Login ']")).click();
	         
			 
		}

	}

}
