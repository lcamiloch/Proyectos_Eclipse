package co.com.mercadolibre;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseTest {
	
	PaginaPrincipal paginaprincipal; 
	Pagina2 pagina2;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {

	paginaprincipal = new PaginaPrincipal();
	pagina2 = new Pagina2();
	
	
	}

}
