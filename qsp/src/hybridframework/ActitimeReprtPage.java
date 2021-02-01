package hybridframework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeReprtPage {
	@FindBy(xpath="//a[@class='content reports']/div[@id='container_reports']") private WebElement reports;
	@FindBy(xpath="//span[.='New Report']") private WebElement newreport;
	@FindBy(xpath="//div[@class='configureButton components_button']") private WebElement configurereport;
	
	public WebElement getConfigurereport() {
		return configurereport;
	}

	public WebElement getNewreport() {
		return newreport;
	}

	public ActitimeReprtPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getReports() {
		return reports;
	}
	
	public void clickOnReports()
	{
		reports.click();
	}
	public void clickOnNewRepo()
	{
		newreport.click();
	}
	public void clickOnConfigureButton()
	{
		configurereport.click();
	}


	

	}


