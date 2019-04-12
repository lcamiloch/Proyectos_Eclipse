package co.com.mercadolibre.testing.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreResultPage {

	public static final Target SEND_PRODUCT = Target.the("campo envio")    		
            .located(By.xpath("//article[contains(@class,'shipment-methods')]"));
	
	public static final Target FIELD_TO_COMPARATE = Target.the("campo envio")    		
            .located(By.xpath("//span[contains(@class,'green')]"));
	
	public static final Target MARK_TO_SEND = Target.the("evidencia envio")    		
            .located(By.xpath("//article[contains(@class,'shipment-methods')]"));
}
