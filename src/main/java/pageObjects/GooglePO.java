package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePO {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public GooglePO(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10); // 10 seundos maximos de espera
	}
	
	public WebElement getSearchBar() {
		WebElement elementoSearchBar = driver.findElement(By.xpath("//input[@title='Buscar']"));
		return elementoSearchBar;
	}
	
	public WebElement getSubmitButton() {
		WebElement elementoSubmitButton = driver.findElements(By.xpath("//input[contains(@value, 'Buscar con')]")).get(0);
		return wait.until(ExpectedConditions.elementToBeClickable(elementoSubmitButton)); // Se retorna el elemento cuanod se pueda hacer click en él
	}
	
	public WebElement getSearchOption() {
		WebElement elementoSearchOption = driver.findElement(By.xpath("//div[@class='r']/a[contains(@href, 'es.wikipedia.org/wiki/Selenium')]"));
		return elementoSearchOption;
	}
	

}
