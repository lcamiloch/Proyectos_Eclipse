package co.com.google.screenplayone.exceptions;

public class PhraseNotFound extends AssertionError{
	
	public static final String PHRASE_NOT_FOUND = "La frase no corresponde a la busqueda";
	
	public PhraseNotFound(String massage, Throwable cause) {
		
		super(massage, cause);		
	}

}
