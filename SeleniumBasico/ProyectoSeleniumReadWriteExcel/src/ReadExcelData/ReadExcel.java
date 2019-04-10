package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hpsf.Array;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {
	
	static String check;
	static String dato;
	static WebDriver driver;
	static String [] veri;
		

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File archivoExcel = new File("C:\\Selenium\\DatosExcel\\Prueba1.xlsx");
		FileInputStream fis = new FileInputStream(archivoExcel);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);		
	
		int numeroCeldas = sheet1.getLastRowNum() + 1;
		System.out.println("Numero de celdas es igual a " + numeroCeldas);
		
		veri = new String[numeroCeldas];
		
		for(int i=0; i < numeroCeldas; i++)
		{
			dato = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("El dato leido de excel es: " + dato);
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.youtube.com");
			driver.findElement(By.id("search")).sendKeys(dato);
			driver.findElement(By.id("search-icon-legacy")).submit();;
			
			try
			{
				
				WebElement Resul = driver.findElement(By.partialLinkText("Documental"));
				
					check = "Encontrado";
					driver.close();
			}
				catch(Exception e)
				{
				check = "No encontrado";			
				driver.close();
				}
			
			
			
			veri[i] = check;
			
			
			System.out.println(i + " " + veri[i]);
			
			check = "";
			
			/*fbuscar(dato);
			
			sheet1.getRow(i).createCell(1).setCellValue(check);
			FileOutputStream fout = new FileOutputStream(archivoExcel);
			wb.write(fout);*/
		}
		
		for(int i=0; i < numeroCeldas; i++)
		{
		System.out.println(i + " " + veri[i]);
		}
	}

}
