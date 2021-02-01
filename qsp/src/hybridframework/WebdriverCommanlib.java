package hybridframework;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommanlib extends BaseTest {
	public String getTitleOfWebpage()
	{
		String title = driver.getTitle();
		return title;
		
	}
	public void verifyTheTitleOfWebpage(String expectedTitle,String actualTitle,String pagename)
	{
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("The"+pagename+"page is displayed : Test Case is Passed"); 
		}
		else
		{
			System.out.println("The"+pagename+"page is not displayed : Test Case is Failed");
		}
	}
	public void selectDropDownByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
		 
	}
	public void selectDropDownByValue(WebElement element,String idorname)
	{
		Select sel = new Select(element);
		sel.selectByValue(idorname);
		 
	}
	public void selectDropDownByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		 
	}
	public void switchFrameByindex(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchFrameByNameId(String nameorid)
	{
		driver.switchTo().frame(nameorid);
	}
	public void switchFrameByElemenet(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void waitForElement(int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void waitForPageLoad(int time,String expectedTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		
	}
	public void mouseHover(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void rightClick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public void doubleClick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public void dragAndDrop(WebElement src,WebElement des)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des);
	}
	public void dropdownOptions(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for(WebElement we:options)
		{
			System.out.println(we.getText());
		}
	}
	public void iAutoScriptForUploadPop() throws IOException
	{
		 
		File ff = new File("./autoiScis/uploadbutfir.exe");
         String abs = ff.getAbsolutePath();
         Runtime.getRuntime().exec(abs);
         
	}
	
	
	
	
	
	
	
	
	

}
