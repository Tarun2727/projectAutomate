package popup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiUploadP {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://online.actitime.com/tsalve/login.do");
          Thread.sleep(2000);   
         driver.findElement(By.name("username")).sendKeys("admin");
         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.xpath("//div[.='Login ']")).click();
         Thread.sleep(4000);
         driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[.='Logo Settings']")).click();
         Thread.sleep(8000);
         driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logoOption' and @value='2']")).click();
         Thread.sleep(4000);
         
         WebElement button = driver.findElement(By.xpath("(//input[@class='inputChooseFile'])[1]"));
         new Actions(driver).doubleClick(button).perform();
         
         File ff = new File("./autoiScis/uploadbutfir.exe");
         String abs = ff.getAbsolutePath();
         Runtime.getRuntime().exec(abs);
         
	}

}
