package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("file:///C:/Users/HP/Desktop/alertpopop.html");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='TRY IT']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();//for alert popup we can use accept ,dismiss,gettext()
		//we switch the control to alert before its generation we get one exception NoAlertPresentException
		
	
		
		
		

	}

}
