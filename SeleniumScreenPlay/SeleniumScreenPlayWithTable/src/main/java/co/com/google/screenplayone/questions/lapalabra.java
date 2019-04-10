package co.com.google.screenplayone.questions;

import co.com.google.screenplayone.userinterfaces.googleresultpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("validar resultado")
public class lapalabra implements Question<String>{

	public lapalabra() {
		
	}
	
	@Override
	public String answeredBy(Actor actor) {

		return googleresultpage.SEARCH_BAR.resolveFor(actor).waitUntilVisible().getValue();
	}
	
	public static lapalabra searched() {
		return new lapalabra();
	}

}
