package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//we have to set the path of driver exe for avoiding the exception.
		System.setProperty("webdriver.chrome.driver","E:\\automationWork\\qsp\\drivers\\chromedriver.exe");
		//it is used to launch the browser and open the browser
		new ChromeDriver();

	}

}
