package co.com.mercadolibre.testing.interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.JavascriptExecutor;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class DownScroll implements Interaction{
	
	
	public static DownScroll inThePage () {
		
		return instrumented(DownScroll.class);
	}

	public DownScroll() {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		((JavascriptExecutor)BrowseTheWeb.as(actor).getDriver()).executeScript("window.scrollBy (0, 300)");
	}

}
