package base;

import org.openqa.selenium.WebDriver;

import pageObjects.GooglePO;

public class GoogleBase {

	private final String URL = "http://google.com"; // Los nombres de las constantes en Mayuscula
	private WebDriver driver;
	
	public GoogleBase(WebDriver driver){
		this.driver = driver;
	}
	
	public void navegarGoogle() {
		System.out.println("Navegando a: "+URL);
		driver.get(URL);
	}
	
	public void buscarEnGoogle(String buscar) {
		GooglePO pageObj = new GooglePO(driver);
		pageObj.getSearchBar().sendKeys(buscar);
		pageObj.getSubmitButton().click();
	}
	
	public void clickOpcion() {
		GooglePO pageObj = new GooglePO(driver);
		pageObj.getSearchOption().click();
	}
}
