package co.com.mercadolibre.testing.tasks;

import static co.com.mercadolibre.testing.userinterfaces.MercadoLibreResultPage.MARK_TO_SEND;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.core.Is.is;

import co.com.mercadolibre.testing.exceptions.ConnectionFailed;
import co.com.mercadolibre.testing.interaction.DownScroll;
import co.com.mercadolibre.testing.interaction.MarkItem;
import co.com.mercadolibre.testing.questions.TheConnection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;


public class VerifyFieldSend implements Task{

	public static VerifyFieldSend delenvio() {
		
		return instrumented(VerifyFieldSend.class);
	}
	
	@Override
	@Step("{0}take evidence of shipping\r\n")
	public <T extends Actor> void performAs(T actor) {
		actor.should(seeThat(TheConnection.isConnect(), is(true)).orComplainWith(ConnectionFailed.class, ConnectionFailed.MESSAGE));
		actor.attemptsTo(DownScroll.inThePage());
		actor.attemptsTo(MarkItem.element(MARK_TO_SEND));
		
	}
}
