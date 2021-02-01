package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebeM1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//it is used to launch the browser/or to open the browser
		WebDriver driver =new ChromeDriver();
		//it is used to maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		driver.findElement(By.name("username")).sendKeys("efbvewbfwebfkewf");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("erigbrwuefhweu");
		Thread.sleep(4000);
		System.out.println( loginButton.isEnabled());
		String attvalue = password.getAttribute("name");
		System.out.println(attvalue);

	}
}