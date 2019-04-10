package SeleniumEvidencia;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	static WebDriver controlador;
	static File archivoFoto;
	static int cont;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		controlador = new ChromeDriver();
		
		controlador.get("https://www.mercadolibre.com.co");
		guardaFoto();
		
		controlador.findElement(By.name("as_word")).sendKeys("vr");
		controlador.findElement(By.xpath("//*[@class='nav-search-btn']")).click();
		guardaFoto();
		
		controlador.findElement(By.className("main-title")).click();
		guardaFoto();
		
		controlador.close();
	}

		public static void guardaFoto() {
		
		try
		{
			cont++;
			archivoFoto = ((TakesScreenshot)controlador).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(archivoFoto, new File("C:\\Selenium\\RegistroFotos\\Registro_" + cont + ".png"));
		}
		catch(IOException e)
		{
			System.out.println("No se logro guardar el archivo");
		}
		

		}

}
