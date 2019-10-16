package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaPO {
	private WebDriver driver;

	public WikipediaPO(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getHistoria() {
		WebElement elem = driver.findElement(By.xpath("//h2/span[text()='Historia']/..//following-sibling::p[1]"));
		return elem;
	}
}
