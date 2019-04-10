package co.com.google.screenplayone.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.google.screenplayone.models.Phrase;

import static co.com.google.screenplayone.userinterfaces.googlehomepage.SEARCH_BAR;
import static co.com.google.screenplayone.userinterfaces.googlehomepage.SEARCH_BUTTON;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class buscarpalabra implements Task {
	
	private String palabra;
	
	public buscarpalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(palabra).into(SEARCH_BAR).thenHit(Keys.ENTER) 
		//Click.on(SEARCH_BUTTON)
				);
	}
	
	public static buscarpalabra composedOfTheWords(Phrase phrase) {
		
		return instrumented(buscarpalabra.class, phrase.getCadenaUno() + " " + phrase.getCadenaDos());
			
	}

}
