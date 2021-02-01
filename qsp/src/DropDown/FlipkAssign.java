package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkAssign {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.Flipkart.com");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//button[text()='✕']")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("q")).sendKeys("laptop");
         Thread.sleep(8000);
         //List<WebElement> res = driver.findElements(By.xpath("//li[@class='Y5N33s']/descendant::div[@class='lrtEPN _17d0yO']/span"));
         List<WebElement> res = driver.findElements(By.xpath("//li[@class='Y5N33s']/descendant::div[@class='lrtEPN _17d0yO']"));
         for(WebElement we:res)
         {
        	 System.out.println(we.getText());
         }
         Thread.sleep(4000);
         for(int i=0;i<res.size();i++)
         {
        	 String clickables = res.get(i).getText();
        	 if(clickables.contains("in Laptops"))
        	 {
        		 res.get(i).click();
        		 break;
        	 }
         }
         Thread.sleep(4000);
         WebElement pricedd = driver.findElement(By.xpath("//div[@class='_3uDYxP']/select[@class='_2YxCDZ']"));
         Select pridrop = new Select(pricedd);
         pridrop.selectByVisibleText("₹50000");
         Thread.sleep(9000);
         driver.findElement(By.xpath("//div[@class='_4921Z t0pPfW' and @title='Core i3']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@class='_4921Z t0pPfW' and @title='Dell']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/div[.='Operating System']")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("//div[@class='_4921Z t0pPfW' and @title='Windows 10']")).click();
         
         Thread.sleep(6000);
         
         String price = driver.findElement(By.xpath("//div[.='Dell Vostro Core i3 10th Gen - (4 GB/1 TB HDD/Windows 10 Home) Vostro 3491 Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
         System.out.println("LAPTOPS PRICE IS --"+price);
         
         Thread.sleep(3000);
         String ram = driver.findElement(By.xpath("//div[.='Dell Vostro Core i3 10th Gen - (4 GB/1 TB HDD/Windows 10 Home) Vostro 3491 Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='fMghEO']/descendant::li[.='4 GB DDR4 RAM']")).getText();
         System.out.println("RAM OF LAPTOP IS----"+ram);
         Thread.sleep(7000);
         driver.close();
         
		

	}

}
