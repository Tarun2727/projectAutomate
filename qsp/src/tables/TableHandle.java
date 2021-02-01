package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/HP/Desktop/Automation%20Pages/dhoomtable.html");
		List<WebElement> alltd = driver.findElements(By.tagName("tr"));
		Thread.sleep(2000);
		System.out.println("number of tr in  table:"+alltd.size());
		WebElement firsttr = driver.findElement(By.xpath("//tr[1]"));
		Thread.sleep(2000);
		List<WebElement> alltdin1 = firsttr.findElements(By.tagName("td"));
		System.out.println("number of td in first row"+alltdin1.size());
		for(WebElement we:alltdin1)
		{
			System.out.println(we.getText());
		}
		driver.close();
		

	}

}
