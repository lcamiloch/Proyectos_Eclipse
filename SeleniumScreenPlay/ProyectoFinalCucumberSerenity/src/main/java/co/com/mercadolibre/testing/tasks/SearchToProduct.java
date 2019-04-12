package co.com.mercadolibre.testing.tasks;

import static co.com.mercadolibre.testing.userinterfaces.MercadoLibreHomePage.SEARCH_BAR;
import static co.com.mercadolibre.testing.userinterfaces.MercadoLibreSelectionpage.LINK_EVIDENCE;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.Keys;

import co.com.mercadolibre.testing.exceptions.ConnectionFailed;
import co.com.mercadolibre.testing.exceptions.LinkNotFound;
import co.com.mercadolibre.testing.interaction.MarkItem;
import co.com.mercadolibre.testing.interaction.SelectToProduct;
import co.com.mercadolibre.testing.model.Word;
import co.com.mercadolibre.testing.questions.TheConnection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchToProduct implements Task{
	
	private String word;

	/**
	 * 	este metodohace........
	 * @param word
 	* @return retonauna clse
 	*/
	public static SearchToProduct product(Word word) {
	
	return instrumented(SearchToProduct.class, word.getproducto());
		
	}
	
	public SearchToProduct(String word) {
		this.word = word;
	}

	@Override
	@Step("{0} searches and selects the product")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.should(seeThat(TheConnection.isConnect(), is(true)).orComplainWith(ConnectionFailed.class, ConnectionFailed.MESSAGE));
		
		actor.attemptsTo(Enter.theValue(word).into(SEARCH_BAR).thenHit(Keys.ENTER));
		
		actor.should(seeThat(the(LINK_EVIDENCE), isVisible()).orComplainWith(LinkNotFound.class, LinkNotFound.MESSAGE));
		
		actor.attemptsTo(MarkItem.element(LINK_EVIDENCE));
		
		actor.attemptsTo(SelectToProduct.clickOnLink());	
	}
}
