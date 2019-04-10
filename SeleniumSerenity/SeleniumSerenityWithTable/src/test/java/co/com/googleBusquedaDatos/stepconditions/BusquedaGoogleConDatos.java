package co.com.googleBusquedaDatos.stepconditions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedaGoogleConDatos {
	
	WebDriver controlador;
	
	@Given("Cam quiere buscar en google")
	public void arthurQuiereBuscarEnGoogle() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		controlador = new ChromeDriver();
		controlador.get("https://www.google.com.co");
		controlador.manage().window().maximize();
	}

	@When("el busca la palabra {string} compuesta {string}")
	public void elBuscaLaPalabra(String palabra, String palabrados) {
	    
		controlador.findElement(By.name("q")).sendKeys(palabra + " " + palabrados);
		controlador.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']")).click();
	}

	@Then("el verifica la palabra {string}")
	public void elVerificaLaPalabra(String palabra) {
	    
		assertTrue(controlador.getPageSource().contains(palabra));
		controlador.close();
	}


}
