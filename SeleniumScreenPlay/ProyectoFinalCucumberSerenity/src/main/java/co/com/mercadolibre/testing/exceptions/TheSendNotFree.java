package co.com.mercadolibre.testing.exceptions;

public class TheSendNotFree extends AssertionError{

public static final String SHIPMENT_OF_PAYMENT ="The send not free";
	
	public TheSendNotFree(String message, Throwable cause) {
		super(message, cause);
		
	}
}
