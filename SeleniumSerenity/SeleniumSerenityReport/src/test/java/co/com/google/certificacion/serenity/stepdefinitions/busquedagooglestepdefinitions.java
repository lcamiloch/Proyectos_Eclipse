package co.com.google.certificacion.serenity.stepdefinitions;

import co.com.google.certificacion.serenity.steps.endusersteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class busquedagooglestepdefinitions {
	
	@Steps
	endusersteps cam;
	
	@Given("^Arthur quiere buscar en google$")
	public void arthur_quiere_buscar_en_google() throws Exception {	   
	    cam.is_the_home_page();
	}


	@When("^el busca la palabra \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void el_busca_la_palabra_compuesta(String arg1, String arg2) throws Exception {
	     cam.looks_for(arg1 + " " + arg2); 
	}

	@Then("^el verifica la palabra \"([^\"]*)\"$")
	public void el_verifica_la_palabra(String arg1) throws Exception {
		     
	}
}
