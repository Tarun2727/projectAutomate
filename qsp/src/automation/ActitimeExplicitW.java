package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeExplicitW {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://online.actitime.com/tsalve/login.do");
           WebDriverWait wait = new WebDriverWait(driver,20);
           wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
            System.out.println("login page is displayed");
            
            
            driver.findElement(By.name("username")).sendKeys("salvetarun27@gmail.com");
            driver.findElement(By.name("pwd")).sendKeys("puzyjABA");
            driver.findElement(By.xpath("//div[.='Login ']")).click();
            
            
            wait.until(ExpectedConditions.titleContains("Enter"));
            //Thread.sleep(4000);
           System.out.println("homepage is displayed");
            
            
            
            
            
            /*if(logintitle.equals("actiTIME - Login"))
            {
            	System.out.println("login page displayed and case passed");
            }
            else
            {
            	System.out.println("login page is not displayed and case failed");
            }
            if(hometitle.equals("actiTIME - Enter Time-Track"))
            {
            	System.out.println("home page displayed and case passed");
            }
            else
            {
            	System.out.println("home page is not displayed and case failed");
            }*/
            
            
            

	}

}