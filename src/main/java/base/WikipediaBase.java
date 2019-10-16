package base;

import org.openqa.selenium.WebDriver;

import pageObjects.WikipediaPO;

public class WikipediaBase {
	private WebDriver driver;
	
	public WikipediaBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public void imprimirHistoria() {
		WikipediaPO po = new WikipediaPO(driver);
		System.out.println("HISTORIA");
		System.out.println(po.getHistoria().getText());
	}

}
