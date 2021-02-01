package methoddrivenframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginpage {
	//declaration of webelements
	@FindBy(name="username") private WebElement username;
	@FindBy(name="pwd") private WebElement password;
	@FindBy(id="loginButton") private WebElement loginBtn;
	
	
	//getter methods for webelements
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//intialization of webelements
	public ActitimeLoginpage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	//now make use of this webelements in business logic method
	
	public void loginProcess(String user,String pass) throws InterruptedException
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		Thread.sleep(3000);
		loginBtn.click();
		Thread.sleep(2000);
		//username.clear();
		
	}
	

}
