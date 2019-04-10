package BuscarDato;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	
	public static void fbuscar(String dato)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.youtube.com");
		driver.findElement(By.id("search")).sendKeys(dato);
		driver.findElement(By.id("search-icon-legacy")).submit();;
		WebElement Resul = driver.findElement(By.partialLinkText("Aplicaciones"));
		
		boolean status = Resul.isDisplayed();
		
		if(status)
		{
			System.out.println("!! Encontrado !!");
			driver.close();
		}
	}

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Selenium\\DatosExcel\\Prueba1.xlsx");
		
		FileInputStream fis = new FileInputStream(src); //obtener datos de un fichero 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int numeroCeldas = sheet1.getLastRowNum() + 1;
		
		for(int i=0; i < numeroCeldas; i++)
		{
			String dato = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			fbuscar(dato);
		}
		
		wb.close();

	}
	
	
	

	
	
}
