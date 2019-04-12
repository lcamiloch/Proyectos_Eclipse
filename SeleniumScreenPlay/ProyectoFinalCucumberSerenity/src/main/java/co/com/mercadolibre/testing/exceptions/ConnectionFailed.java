package co.com.mercadolibre.testing.exceptions;

public class ConnectionFailed extends AssertionError{
	
public static final String MESSAGE ="Connection failed";
	
	public ConnectionFailed(String message, Throwable cause) {
		super(message, cause);
		
	}

}
