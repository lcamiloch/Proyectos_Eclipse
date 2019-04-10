package co.com.mercadolibre;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import co.com.mercadolibre.test.ConexionBaseDatos;

public class MetodosPrincipal {
	
	private String URL = "https://www.mercadolibre.com.co";
	//private ConexionBaseDatos parametroBusqueda;
	private WebDriver controlador;
	private WebElement validador;
		
	By IconoPaginaPrincipal = By.xpath("//a[@class='nav-logo']");
	By BarraDeBusqueda = By.name("as_word");
	By IconoBusqueda = By.xpath("//*[@class='nav-search-btn']");
	
	public MetodosPrincipal(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		this.controlador = new ChromeDriver();
	}
		

	public void CargandoPaginaWeb() {
		
		this.controlador.get(URL);
	}
	
	public void BuscandoIconoprincipal() {
		
		this.validador = this.controlador.findElement(IconoPaginaPrincipal);
	}
	
	public void EscribirUnElemento() {
		
		this.controlador.findElement(BarraDeBusqueda).sendKeys("vuelos");
	}
	
	public void ClickBuscarElemento() {
		
		this.controlador.findElement(IconoBusqueda).click();
	}

	public WebElement getvalidador() {
		
		return this.validador;
	}
	
	public WebDriver getcontrolador() {
		
		return this.controlador;
	}
	
	public void setvalidador(WebElement validador2) {
		
		this.validador = validador2;
	}
	
	public void setcontrolador(WebDriver controlador2) {
		
		this.controlador = controlador2;
	}
	
}
