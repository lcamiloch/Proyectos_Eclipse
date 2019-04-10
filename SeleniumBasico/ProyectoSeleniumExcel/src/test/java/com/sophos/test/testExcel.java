package com.sophos.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testExcel {

	XSSFSheet hojaExcel;
	XSSFWorkbook libroExcel;
	String check;
	File archivoExcel;
	static FileOutputStream archivoSalida;
	FileInputStream archivoEntreda;
	WebDriver driver;
	static String[] datoVerificacion;
	int numeroCeldas;
	static String datoBusqueda;
	WebElement Resul;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		archivoExcel = new File("C:\\Selenium\\DatosExcel\\Prueba1.xlsx");
		archivoEntreda = new FileInputStream(archivoExcel);
		libroExcel = new XSSFWorkbook(archivoEntreda);
		hojaExcel = libroExcel.getSheetAt(0);
		numeroCeldas = hojaExcel.getLastRowNum() + 1;
		datoVerificacion = new String[numeroCeldas];
		archivoSalida = new FileOutputStream(archivoExcel);

	}

	@After
	public void tearDown() throws Exception {
		libroExcel.write(archivoSalida);
		driver.close();
		libroExcel.close();
	}

	@Test
	public void test() {
		
		for (int i = 0; i < numeroCeldas; i++) {

			datoBusqueda = hojaExcel.getRow(i).getCell(0).getStringCellValue();

			try {
				driver.get("http://www.youtube.com");
				driver.findElement(By.id("search")).sendKeys(datoBusqueda);
				driver.findElement(By.id("search-icon-legacy")).submit();
				Resul = driver.findElement(By.partialLinkText("Sophia"));

				assertEquals(true, Resul.isDisplayed());
				check = "Encontrado";

			} catch (RuntimeException e) {
				assertEquals(false, false);
				check = "No encontrado";
			}

			datoVerificacion[i] = check;
			hojaExcel.getRow(i).createCell(hojaExcel.getRow(i).getLastCellNum()).setCellValue(datoVerificacion[i]);

		}
	}
}
