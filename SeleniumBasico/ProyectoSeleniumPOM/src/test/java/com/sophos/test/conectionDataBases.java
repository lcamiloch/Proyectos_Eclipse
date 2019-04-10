package com.sophos.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.interactions.Actions;

import com.mysql.jdbc.Statement;

public class conectionDataBases {

	private static final String Controlador = "com.mysql.jdbc.Driver";
	private static final String Enlace = "jdbc:mysql://localhost:3306/busquedas";
	private static final String Usuario = "root";
	private static final String Password = "123456/*";
	static Connection conexion;
	static Statement s;
	static ResultSet rs;
	static int datoAleatorio;
	static String parametro;

	public Connection establecerConexion() {

		datoAleatorio = (int) (Math.random() * (10-1+1) + 1);

		
		try {
			Class.forName(Controlador);

			conexion = DriverManager.getConnection(Enlace, Usuario, Password);

			Statement s = (Statement) conexion.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM elementos_de_busqueda where Id = 1;");

			System.out.println("Conexion exitosa");
			
			rs.next();
			parametro =  rs.getString (2);
		   
		} catch (ClassNotFoundException e) {

			System.out.println("Error al cargar el controlador");

		} catch (SQLException e) {

			System.out.println("Error en la conexion");
		}

		return conexion;
	}
	
	public void escrituraDataBase() throws SQLException {
		
		 s.executeQuery("Update elementos_de_busqueda Set verificacion = 'Encontrado' Where Id = 1;");
	}

	public void cerrarConexion() throws SQLException {
		
		conexion.close();
	}
}
