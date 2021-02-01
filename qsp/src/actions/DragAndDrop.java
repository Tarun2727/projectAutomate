package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.get("file:///C:/Users/HP/Desktop/Automation%20Pages/DragDrop.html");
	Actions act = new Actions(driver);
	WebElement src = driver.findElement(By.id("draggable-2"));
	WebElement dest = driver.findElement(By.id("droppable-2"));
	Thread.sleep(2000);
	act.dragAndDrop(src, dest).perform();

	
	}

}
