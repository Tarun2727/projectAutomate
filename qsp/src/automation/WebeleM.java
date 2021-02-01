package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebeleM {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		//boolean logb =driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).isEnabled();
		//System.out.println("before sending keys in username and password"+logb);
		Thread.sleep(3000);
		WebElement uname = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement bulog = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		uname.sendKeys("klausgfaeg");
		pass.sendKeys("gsdofughf324");
		Thread.sleep(4000);
		boolean logb1 = bulog.isEnabled();
		System.out.println("after sending keys in username and password"+logb1);
		Thread.sleep(3000);
		String passat = pass.getAttribute("aria-label");
		System.out.println(passat);
		Thread.sleep(3000);
		String passcv = pass.getCssValue("background-color");
		System.out.println(passcv);
		
		WebElement logo = driver.findElement(By.xpath("//h1[.='Instagram']"));
		Point logloc = logo.getLocation();
		Thread.sleep(2000);
		System.out.println(logloc.getY()+"         "+logloc.getX());
		Thread.sleep(2000);
		Dimension logsiz = logo.getSize();
		System.out.println(logsiz.getHeight()+"   "+logsiz.getWidth());
	     System.out.println(logo.isDisplayed());
		
	}

}
