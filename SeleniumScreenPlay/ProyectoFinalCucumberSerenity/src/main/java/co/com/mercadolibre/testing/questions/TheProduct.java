package co.com.mercadolibre.testing.questions;

import co.com.mercadolibre.testing.userinterfaces.MercadoLibreResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class TheProduct implements Question<String>{
	
	
	public static TheProduct searched() {

		return new TheProduct();
	}
	
	public TheProduct() {
		
	}
	
	@Override
	@Step("{0} verifies the shipping field")
	public String answeredBy(Actor actor) {
		
		
		return MercadoLibreResultPage.FIELD_TO_COMPARATE.resolveFor(actor).getTextContent();
		
	}	
	
}
