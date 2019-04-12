package co.com.mercadolibre.testing.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class MercadoLibreHomePage extends PageObject{

	public static final String URL_HOME = "https://www.mercadolibre.com.co/";
	
	public static final Target SEARCH_BAR = Target.the("search bar")    		
            .located(By.name("as_word"));
	
	public static final Target LOGO_MERCADOLIBRE = Target.the("tittle home page")    		
            .located(By.xpath("//a[@class='nav-logo']"));
}
