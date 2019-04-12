package co.com.mercadolibre.testing.tasks;

import static co.com.mercadolibre.testing.userinterfaces.MercadoLibreHomePage.LOGO_MERCADOLIBRE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.mercadolibre.testing.exceptions.LogoPageNotFound;
import co.com.mercadolibre.testing.interaction.MarkItem;
import co.com.mercadolibre.testing.userinterfaces.MercadoLibreHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Initialize implements Task{

	
	MercadoLibreHomePage homePage;
	
	public static Initialize browser() {
		
		return instrumented(Initialize.class);
			
		}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.wasAbleTo(Open.browserOn().the(homePage));
		actor.attemptsTo(MarkItem.element(LOGO_MERCADOLIBRE));
		actor.should(seeThat(the(LOGO_MERCADOLIBRE), isVisible())							
				.orComplainWith(LogoPageNotFound.class, LogoPageNotFound.MESSAGE));
	}
	
}
