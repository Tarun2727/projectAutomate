package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHDPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.cleartrip.com/");
        Thread.sleep(7000);
        driver.findElement(By.xpath("(//a[@class='calendarIcon']/i[@class='icon ir datePicker'])[1]")).click();
        driver.findElement(By.xpath("//td[@data-month='11']/a[.='25']")).click();

	}

}
