package co.com.mercadolibre.testing.interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.JavascriptExecutor;

import static co.com.mercadolibre.testing.utils.ArgumentJavaScript.CODE_JAVA_SCRIPT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class MarkItem implements Interaction{
	
	private Target target;

	
	public static MarkItem element (Target target) {
	
	return instrumented(MarkItem.class, target);
	}

	
	public MarkItem(Target target) {
		
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		((JavascriptExecutor)BrowseTheWeb.as(actor).getDriver()).executeScript(CODE_JAVA_SCRIPT,target.resolveFor(actor));
	}
	
}
