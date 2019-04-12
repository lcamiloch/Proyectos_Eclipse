package co.com.mercadolibre.testing.utils;

import static co.com.mercadolibre.testing.userinterfaces.MercadoLibreHomePage.URL_HOME;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestConnection {
	
	public static String verify;
	private static URL addressTest;
	private static HttpURLConnection testConnection;
	private static int codeHTML;
	private static int connectionTimeInmls	 = 4000;
	
	public static boolean testConnection() {
		
		try {
			addressTest = new URL(URL_HOME);
			testConnection = (HttpURLConnection) addressTest.openConnection();
			testConnection.setRequestMethod("HEAD");
			testConnection.setConnectTimeout(connectionTimeInmls);
			testConnection.setReadTimeout(connectionTimeInmls);
			codeHTML = testConnection.getResponseCode();
			if (200 <= codeHTML && codeHTML <= 400) {
				return true;		
			}
			
		} catch (Exception e) {	
			return false;		
		}
		return false;
	}
}
