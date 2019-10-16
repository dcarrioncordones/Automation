package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopularPO {
	private WebDriver driver;

	public PopularPO(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNombreTarjeta() {
		WebElement elem = driver.findElement(By.xpath("//h3[contains(text(), '#ORBITPOPULAR')]"));
		return elem;
	}

	public WebElement getInfoTarjeta() {
		WebElement elem = driver.findElement(By.xpath("//h3[contains(text(), '#ORBITPOPULAR')]/..//following-sibling::p"));
		return elem;
	}

}
