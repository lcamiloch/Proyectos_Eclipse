package IESekenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Quitar check de modo protegido en IE

public class scripselen {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
		WebDriver driverIE = new InternetExplorerDriver();
		driverIE.get("https://www.youtube.com");
		//driver.close();
		driverIE.findElement(By.name("search_query")).sendKeys("selenium advance");
		driverIE.findElement(By.name("go")).submit();

	}

}