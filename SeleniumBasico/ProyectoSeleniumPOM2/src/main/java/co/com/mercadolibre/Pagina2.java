package co.com.mercadolibre;

import co.com.mercadolibreutiles.utilidades;

public class Pagina2 {
	
	MetodosPagina2 metodos2 = new MetodosPagina2();
	MetodosPrincipal metodoprincipal = new MetodosPrincipal();
	utilidades utilidades = new utilidades(metodoprincipal.getcontrolador());
	
	public Pagina2() {
		
		metodos2.setcontrolador3(metodoprincipal.getcontrolador());
		
		metodos2.EncontrarPrimerLink();
		
		metodos2.ClickLinkEncontrado();
		
		
	}

}
