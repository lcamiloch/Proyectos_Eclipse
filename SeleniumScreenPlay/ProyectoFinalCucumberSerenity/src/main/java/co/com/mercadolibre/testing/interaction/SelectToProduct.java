package co.com.mercadolibre.testing.interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.mercadolibre.testing.userinterfaces.MercadoLibreSelectionpage.LINK_SELECTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SelectToProduct implements Interaction{
	
	
	public static SelectToProduct clickOnLink() {
		
		return instrumented(SelectToProduct.class);
			
	}
	
	public SelectToProduct() {
		// TODO Auto-generated constructor stub
	}
	@Override
	@Step("{0} clicks on the link of the first product")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(LINK_SELECTION));
	}
	
}
