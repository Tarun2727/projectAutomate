package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("file:///C:/Users/HP/Desktop/confpop.html");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='I AM HUNGRY']")).click();
		Alert al = driver.switchTo().alert();
		 Thread.sleep(3000);
		al.accept();//for accepting
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='I AM HUNGRY']")).click();
		Alert al1 = driver.switchTo().alert();
		 Thread.sleep(3000);
		 al1.dismiss();//for canceling
		 
		 driver.findElement(By.xpath("//button[.='I AM HUNGRY']")).click();
			Alert al2 = driver.switchTo().alert();
			 Thread.sleep(3000);
			 String txt = al2.getText();//for taking the text of the popup
			 System.out.println(txt);
		

	}

}
