package co.com.mercadolibre.testing.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreSelectionpage extends PageObject{
	
	public static final Target LINK_SELECTION = Target.the("Link product")    		
            .located(By.className("item__info-title"));
	
	public static final Target LINK_EVIDENCE = Target.the("Link product")    		
            .located(By.xpath("//*[contains(@class,'main-title')]"));
}
