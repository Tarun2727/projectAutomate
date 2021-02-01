package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNLOC {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/WebELE.html");
		Thread.sleep(3000);
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.close();
		WebElement checkb = driver.findElement(By.id("i2"));
		boolean checkbs = checkb.isSelected();
		System.out.println(checkbs);
		Thread.sleep(4000);
		checkb.click();
		boolean checkbs1 = checkb.isSelected();
		Thread.sleep(2000);
		System.out.println(checkbs1);
	}

}
