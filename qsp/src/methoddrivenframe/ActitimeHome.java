package methoddrivenframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHome {
	//declare of webelement
	@FindBy(xpath="//a[@class='content administration']") private WebElement settings;
	@FindBy(className="content tasks") private WebElement task;
	@FindBy(xpath="//a[@class='content reports']/div[@id='container_reports']") private WebElement reports;
	
	//intialization
	public ActitimeHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//generating the getter method for webelements
	
	public WebElement getSettings() {
		return settings;
	}

	public WebElement getTask() {
		return task;
	}

	public WebElement getReports() {
		return reports;
	}
	
	
	
	
	
	//methods of using the webelements 
	
	public void clickOnSettings()
	{
		settings.click();
	}
	
	
	public void clickOnReports()
	{
		reports.click();
	}
	
	
	
	

}
