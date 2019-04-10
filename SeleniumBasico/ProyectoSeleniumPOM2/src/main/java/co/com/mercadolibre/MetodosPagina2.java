package co.com.mercadolibre;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetodosPagina2 {
	
	WebElement validador3;
	WebDriver controlador3;
	By PrimerLink = By.className("main-title");
	
	
	
	
	public void EncontrarPrimerLink() {
		this.validador3 = controlador3.findElement(PrimerLink);
	}
	
	public void ClickLinkEncontrado() {
		this.controlador3.findElement(PrimerLink).click();
	}
	
	public void setvalidador3(WebElement validador) {
		
		this.validador3 = validador;
	}
	
	public void setcontrolador3(WebDriver controlador) {
		
		this.controlador3 = controlador;
	}

}
