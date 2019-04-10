package co.com.google.screenplayone.stepsdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.google.screenplayone.exceptions.PhraseNotFound;
import co.com.google.screenplayone.models.Phrase;
import co.com.google.screenplayone.questions.lapalabra;
import co.com.google.screenplayone.tasks.buscarpalabra;
import co.com.google.screenplayone.userinterfaces.googlehomepage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class busquedagooglescreenplaystepdefinitions {
	
	googlehomepage googlehomepage;
	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor camilo = Actor.named("El tester");
    
    @Before
	public void actorCanBrowseTheWeb() {
    	camilo.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Camilo esta en el navegador en la pagina de google$")
	public void camilo_esta_en_el_navegador_en_la_pagina_de_google() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		camilo.wasAbleTo(Open.browserOn().the(googlehomepage));
	     
	}

	//@When("^el busca la frase \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	//public void el_busca_la_frase_compuesta(String palabrauno, String palabrados) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//camilo.attemptsTo(buscarpalabra.composedOfTheWords(palabrauno, palabrados));	
	//}


	@When("^el busca la frase  compuesta$")
	public void el_busca_la_frase_compuesta(List<Phrase>phrase)  {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		camilo.attemptsTo(buscarpalabra.composedOfTheWords(phrase.get(0)));
	}
	
	
	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void el_verifica_que_la_palabra_este_en_los_resultados(String resultadoEsperado) throws Exception {
	    // Write code here that turns the phrase above into concrete actions   
		camilo.should(seeThat(lapalabra.searched(), is(resultadoEsperado)).orComplainWith(PhraseNotFound.class, PhraseNotFound.PHRASE_NOT_FOUND)); 
	}

}
