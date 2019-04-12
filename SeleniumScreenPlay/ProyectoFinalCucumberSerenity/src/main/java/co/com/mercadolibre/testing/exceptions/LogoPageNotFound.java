package co.com.mercadolibre.testing.exceptions;

public class LogoPageNotFound extends AssertionError{
	
public static final String MESSAGE ="Logo home page not found";
	
	public LogoPageNotFound(String message, Throwable cause) {
		super(message, cause);
		
	}

}
