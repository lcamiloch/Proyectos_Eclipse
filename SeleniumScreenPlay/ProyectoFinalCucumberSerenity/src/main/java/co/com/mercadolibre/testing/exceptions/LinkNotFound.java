package co.com.mercadolibre.testing.exceptions;

public class LinkNotFound extends AssertionError{
	
public static final String MESSAGE ="Link not found";
	
	public LinkNotFound(String message, Throwable cause) {
		super(message, cause);
		
	}

}
