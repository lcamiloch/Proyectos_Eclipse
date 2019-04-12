package co.com.mercadolibre.testing.questions;

import static co.com.mercadolibre.testing.utils.TestConnection.testConnection;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheConnection implements Question<Boolean> {

	public static TheConnection isConnect() {

		return new TheConnection();
	}

	@Override
	public Boolean answeredBy(Actor actor) {

		return testConnection();
	}
}
