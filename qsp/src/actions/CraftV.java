package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CraftV {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com");
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//a[.='Jackets']")).click();
		// because that element is not interactable since it need to mouse hover at its
		// parent element
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[contains(.,'MEN')]"));
		act.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Jackets']")).click();

	}

}
