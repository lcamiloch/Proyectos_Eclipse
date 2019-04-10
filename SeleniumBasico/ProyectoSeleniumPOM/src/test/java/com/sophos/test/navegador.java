package com.sophos.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navegador {

	WebDriver controlador;
	static File archivoFoto;
	static int cont;
	WebElement validado;
	conectionDataBases parametroBusqueda;

	public void inicio() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		controlador = new ChromeDriver();
	}

	public void proceso() {

		parametroBusqueda = new conectionDataBases();

		try {
			controlador.get("https://www.mercadolibre.com.co");
			controlador.manage().window().maximize();
			screenShot();
			

			controlador.findElement(By.name("as_word")).sendKeys(parametroBusqueda.parametro);
			controlador.findElement(By.xpath("//*[@class='nav-search-btn']")).click();
			screenShot();

			controlador.findElement(By.partialLinkText("Desarrollador")).click();
			screenShot();

			validado = controlador.findElement(By.xpath("//span[contains(text(),'Envío gratis a nivel nacional')]"));
			assertEquals(true, validado.isDisplayed());

		} catch (IOException e) {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void screenShot() throws Exception {

		cont++;
		archivoFoto = ((TakesScreenshot) controlador).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(archivoFoto, new File("C:\\Selenium\\RegistroFotos\\Registro " + cont + ".png"));
	}

	public void cerrarNavegador() {

		controlador.close();
	}
}
