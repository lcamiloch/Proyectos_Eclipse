package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Statement;

public class conexion {

	private static final String Controlador = "com.mysql.jdbc.Driver";
	private static final String Enlace = "jdbc:mysql://localhost:3306/testselenium";
	private static final String Usuario = "root";
	private static final String Password = "123456/*";
	String check;
	static int Cont;
	
	
	public void buscar(String dato)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try
		{
			driver.get("http://www.youtube.com");
			driver.findElement(By.id("search")).sendKeys(dato);
			driver.findElement(By.id("search-icon-legacy")).submit();;
			WebElement Resul = driver.findElement(By.partialLinkText("Documental"));
			
			boolean status = Resul.isDisplayed();
			
			if(status)
			{
				check = "Encontrado";
				driver.close();
			}
		}
		catch(Exception e)
		{
			check = "No encontrado";			
			driver.close();
		}
		
	}
	
	public Connection conectar() // refactorizar static
	{
		Connection conexion = null;
		
		try {
			Class.forName(Controlador);
			
			conexion = DriverManager.getConnection(Enlace, Usuario, Password);
			
			Statement s = (Statement) conexion.createStatement();
			ResultSet rs = s.executeQuery ("select * from selenium");
			
			System.out.println("Conexion exitosa");
			
			while (rs.next())
			{ 
				Cont++;
				
				String dato = "";
				dato = rs.getString (2);
			    System.out.println (dato);
			    buscar(dato);
			    
			    PreparedStatement ps = conexion.prepareStatement("Update selenium Set Verificación = '" + check + "' Where Verificación = 'Pendiente' and Id = " + Cont);
			    ps.executeUpdate();
			    
			}
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Error al cargar el controlador");
			
			e.printStackTrace();
		}
		catch(SQLException e) {
		
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	public static void main(String[] args) {
	
		Cont = 0;
		conexion conect = new conexion();
		conect.conectar();
		
		
	}

}
