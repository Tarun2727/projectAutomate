package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRedB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.redbus.com/");
        Thread.sleep(7000);
        
        driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//td[@class='current day' and .='25'])[2]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[.='Return Date']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//td[@class='current day' and .='25'])[2]")).click();
        Thread.sleep(6000);
        driver.navigate().refresh();

	}

}
