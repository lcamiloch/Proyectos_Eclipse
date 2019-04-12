package co.com.mercadolibre.testing.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.WebDriver;

import co.com.mercadolibre.testing.exceptions.ConnectionFailed;
import co.com.mercadolibre.testing.exceptions.TheSendNotFree;
import co.com.mercadolibre.testing.model.Word;
import co.com.mercadolibre.testing.questions.TheConnection;
import co.com.mercadolibre.testing.questions.TheProduct;
import co.com.mercadolibre.testing.tasks.Initialize;
import co.com.mercadolibre.testing.tasks.SearchToProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class EnvioProductoGratisMercadolibreStepDefinitions {
	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor camilo = Actor.named("Camilo Chaparro");
	
    @Before
    public void actorabrenavegador() {
    	
    	camilo.should(seeThat(TheConnection.isConnect(), is(true))
    			.orComplainWith(ConnectionFailed.class, ConnectionFailed.MESSAGE));
    	camilo.can(BrowseTheWeb.with(hisBrowser));
    }
  
	@Given("^Camilo could enter the mercadolibre page$")	
	public void Camilo_could_enter_the_mercadolibre_page() throws Exception {
	    
		camilo.wasAbleTo(Initialize.browser());
	}

	@When("^select a \"([^\"]*)\" to buy$")
	public void select_a_to_buy(Word Word) throws Exception {
	    
		camilo.attemptsTo(SearchToProduct.product(Word));
	}

	@Then("^verify that the shipping is \"([^\"]*)\"$")
	public void verify_that_the_shipping_is(String word) throws Exception {
	    
		camilo.should(seeThat(TheProduct.searched(), containsString(word))
				.orComplainWith(TheSendNotFree.class, TheSendNotFree.SHIPMENT_OF_PAYMENT));
	}

}
