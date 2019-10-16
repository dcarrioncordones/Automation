package base;

import org.openqa.selenium.WebDriver;

import pageObjects.GooglePO;
import pageObjects.PopularPO;

public class PopularBase {

	private final String URL = "http://popularenlinea.com"; // Los nombres de las constantes en Mayuscula
	private WebDriver driver;
	
	public PopularBase(WebDriver driver){
		this.driver = driver;
	}
	
	public void navegarPopular() {
		System.out.println("Navegando a: "+URL);
		driver.get(URL);
	}
	
	public void imprimirInfoTarjeta() {
		PopularPO page =new PopularPO(driver);
		System.out.println(page.getNombreTarjeta().getText());
		System.out.println("-----------------------");
		System.out.println(page.getInfoTarjeta().getText());
	}
	
	
}
