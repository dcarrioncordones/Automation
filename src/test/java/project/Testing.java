package project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.GoogleBase;
import base.PopularBase;
import base.WikipediaBase;
import pageObjects.PopularPO;
import utils.WebDriverBase;

public class Testing {

	private WebDriver driver;
	private  WebDriverBase driverBase;
	
	@Before
	public void inicializar() {
		// ESTE METODO CORRE ANTES DE CADA TEST
		driverBase = new WebDriverBase();
		driver = driverBase.initChrome();
	}
	
	@After
	public void cerrarNavegador() {
		// ESTE METODO CORRE DESPUES DE CADA TEST
		driverBase.closeDriver();
	}
	
	@Test
	public void pruebasGoogle() {
		GoogleBase gbase = new GoogleBase(driver);
		WikipediaBase wbase = new WikipediaBase(driver);
		gbase.navegarGoogle();
		gbase.buscarEnGoogle("Selenium Java Wikipedia");
		gbase.clickOpcion();
		
		wbase.imprimirHistoria();
	}
	
	@Test
	public void pruebasPopular() {
		PopularBase pbase = new PopularBase(driver);
		pbase.navegarPopular();
		pbase.imprimirInfoTarjeta();
	}
}
