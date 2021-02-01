package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeS {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://online.actitime.com/tsalve/login.do");
            String logintitle=driver.getTitle();
            System.out.println(logintitle);
            driver.findElement(By.name("username")).sendKeys("salvetarun27@gmail.com");
            driver.findElement(By.name("pwd")).sendKeys("puzyjABA");
            driver.findElement(By.xpath("//div[.='Login ']")).click();
            Thread.sleep(4000);
            String hometitle = driver.getTitle();
            if(logintitle.equals("actiTIME - Login"))
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
            }
            
            
            

	}

}
