package frameops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("file:///C:/Users/HP/Desktop/Automation%20Pages/usernm.html");
		 driver.findElement(By.id("i01")).sendKeys("bhalog");
		 //1st way WebElement frmadd = driver.findElement(By.xpath("//iframe[@class='frcls']"));
		 //driver.switchTo().frame(frmadd);
		 //2nd way driver.switchTo().frame("frid");
		 driver.switchTo().frame(0);
		 Thread.sleep(3000);
		 driver.findElement(By.id("i02")).sendKeys("dostlog");
		 Thread.sleep(3000);
		 //if we want to go back to parent browser/default browser
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("i01")).clear();
		 
		 

	}

}
