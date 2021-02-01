package hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {
	//declare of webelement
	@FindBy(className="content tasks") private WebElement task;
	@FindBy(xpath="//a[@class='content reports']/div[@id='container_reports']") private WebElement reports;
	@FindBy(xpath="(//div[@class='popup_menu_icon']/div[@class='menu_icon'])[2]") private WebElement settings;
	@FindBy(xpath="(//div[@class='item_title'])[3]") private WebElement generalsettings;
	@FindBy(name="firstHierarchyLevelCode") private WebElement firstdropdown1;
	@FindBy(name="secondHierarchyLevelCode") private WebElement seconnddropdown2;
	@FindBy(name="thirdHierarchyLevelCode") private WebElement thirddropdown3;
	@FindBy(xpath="//a[.='Logo Settings']") private WebElement logosetting;
	@FindBy(xpath="//input[@name='formCustomInterfaceLogo.logoOption' and @value='2']") private WebElement radioforupload;
	@FindBy(xpath="(//input[@class='inputChooseFile'])[1]") private WebElement choosefilebutton;
	
	
	public WebElement getChoosefilebutton() {
		return choosefilebutton;
	}


	public WebElement getRadioforupload() {
		return radioforupload;
	}


	public WebElement getLogosetting() {
		return logosetting;
	}


	public WebElement getThirddropdown3() {
		return thirddropdown3;
	}


	public WebElement getSeconnddropdown2() {
		return seconnddropdown2;
	}


	public WebElement getFirstdropdown1() {
		return firstdropdown1;
	}


	public WebElement getGeneralsettings() {
		return generalsettings;
	}


	public WebElement getSettings() {
		return settings;
	}


	//intialization
	public ActitimeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//generating the getter method for webelements

	public WebElement getTask() {
		return task;
	}

	public WebElement getReports() {
		return reports;
	}
	
	
	
	
	
	//methods of using the webelements 
	public void  clickOnSettings()
	{
		settings.click();
	}
	public void clickOnGeneralSettings()
	{
		generalsettings.click();
	}

	
	
	
	

	public void clickOnTask()
    {
		task.click();
	}
	
	public void clickOnReports()
	{
		reports.click();
	}
	public void clickOnLogoSet()
	{
		logosetting.click();
	}
	public void clickOnRadioForUpload()
	{
		radioforupload.click();
	}
	public void clickOnChooseFileButton()
	{
		choosefilebutton.click();
	}
	
	
	
	
	

}
