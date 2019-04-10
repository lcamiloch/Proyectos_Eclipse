package co.com.mercadolibreutiles;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.mercadolibre.MetodosPrincipal;

public class utilidades {

	private String SCRIPT_MARCACION_EVIDENCIA = "arguments[0].setAttribute('style','border: solid 2px red');";
	private JavascriptExecutor diseñoFoto;
	private WebElement validador2;
	private WebDriver controlador2;
	private File archivoFoto;
	private int contador;
	
	public utilidades(WebDriver controlador) {
		this.controlador2 = controlador;
	}
	

	
	public void MaximizarPagina() {
		
		controlador2.manage().window().maximize();
	
	}
	
	public void configurarjs() {
	
		this.diseñoFoto = (JavascriptExecutor)controlador2;
	}
	
	public void marcacionEvidencia(WebDriver controlador, WebElement validador) {
		
		this.diseñoFoto.executeScript(SCRIPT_MARCACION_EVIDENCIA, validador);
	}
		
	public void tomarEvidencia() throws Exception {

		this.contador++;
		this.archivoFoto = ((TakesScreenshot) controlador2).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(archivoFoto, new File("C:\\Selenium\\RegistroFotos\\Registro " + contador + ".png"));
	}	
		
	public WebDriver getcontrolador2() {
		
		return this.controlador2;
	}
	
	public void setcontrolador2(WebDriver controlador) {
		
		this.controlador2 = controlador;
	}
	
	public WebElement getvalidador2() {
		
		return this.validador2;
	}
	
	public void setvalidador2(WebElement validador) {
	
		this.validador2 = validador;
	}
	
}
