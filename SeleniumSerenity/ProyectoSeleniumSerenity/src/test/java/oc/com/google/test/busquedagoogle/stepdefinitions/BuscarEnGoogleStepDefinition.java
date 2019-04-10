package oc.com.google.test.busquedagoogle.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEnGoogleStepDefinition {
	
	WebDriver controlador;
	Scenario escenario;
	
	@Before
	public void inicioFoto(Scenario escenario) {
		this.escenario = escenario;
	}
		
	@Given("Cam am on the Google home page")
	public void arthur_am_on_the_Google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Arthur abre su navegador");
		System.out.println("Arthuro abre la pagina inicio google");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		controlador = new ChromeDriver();
		controlador.get("https://www.google.com.co");
		controlador.manage().window().maximize();
	}

	@When("he does the search")
	public void he_does_the_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de busqueda Arthuro escribe una palabra");
		controlador.findElement(By.name("q")).sendKeys("Switch");
		
		System.out.println("Arthur da click en el boton buscar");
		controlador.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']")).click();
	}

	@Then("he validates the result success.")
	public void he_validates_the_result_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("El actor captura los resultados de busqueda");
		System.out.println("El actor verifica que la busqueda sea exitosa");
		
		byte[] screenshot = ((TakesScreenshot) controlador).getScreenshotAs(OutputType.BYTES);
		escenario.embed(screenshot, "image/png");
		
		controlador.close();
	}
}
