package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverBase {
	
	private WebDriver driver;
	
	public WebDriver initChrome() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver initIE() {
		System.setProperty("webdriver.ie.driver", "./src/main/resources/drivers/iedriver.exe");
		driver = new InternetExplorerDriver();
		return driver;
	}
	
	public void closeDriver() {
		driver.quit();
		driver = null;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
