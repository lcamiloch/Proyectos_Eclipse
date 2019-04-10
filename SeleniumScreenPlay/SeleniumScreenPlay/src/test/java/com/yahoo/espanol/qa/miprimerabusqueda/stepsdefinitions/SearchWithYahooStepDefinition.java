package com.yahoo.espanol.qa.miprimerabusqueda.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import com.yahoo.espanol.qa.miprimerabusqueda.questions.TheResult;
import com.yahoo.espanol.qa.miprimerabusqueda.tasks.LookUpSomething;
import com.yahoo.espanol.qa.miprimerabusqueda.userinterfaces.YahooHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class SearchWithYahooStepDefinition {
	YahooHomePage yahooHomePage;
	
	@Managed
	private WebDriver hisBrowser;
	private Actor goku = Actor.named("GokuFase3");
	
	@Before
	public void actorCanBrowseTheWeb() {
		goku.can(BrowseTheWeb.with(hisBrowser));
	}
		
	@Given("^Goku is in the site yahoo$")
	public void gokuIsInTheSiteYahoo() {
		goku.wasAbleTo(Open.browserOn().the(yahooHomePage));
	}

	@When("^He search the word \"([^\"]*)\"$")
	public void heSearchTheWord(String word) {
		goku.attemptsTo(LookUpSomething.composedOfTheWords(word));
	}

	@Then("^He verify that the word \"([^\"]*)\" is in the results$")
	public void heVerifyThatTheWordIsInTheResults(String expectedResult) {
		goku.should(seeThat(TheResult.searched(), is(expectedResult)));
	}

}
