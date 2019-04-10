package com.sophos.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import okhttp3.internal.cache.DiskLruCache.Snapshot;

public class RetoNavegador {
	
	navegador nuevo;
	conectionDataBases enlace;
	
	@Before
	public void setUp() throws Exception {
		
		nuevo = new navegador();
		enlace = new conectionDataBases();
		
		nuevo.inicio();
		enlace.establecerConexion();
		
	}

	@After
	public void tearDown() throws Exception {
		
		enlace.escrituraDataBase();
		nuevo.cerrarNavegador();
		enlace.cerrarConexion();
		
	}

	@Test
	public void test() {
				
		nuevo.proceso();
	}

}
