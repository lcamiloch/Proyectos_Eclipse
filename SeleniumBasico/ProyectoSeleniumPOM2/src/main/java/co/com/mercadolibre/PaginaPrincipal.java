package co.com.mercadolibre;

import co.com.mercadolibreutiles.utilidades;

public class PaginaPrincipal {
	
	MetodosPrincipal metodosprincipal = new MetodosPrincipal();
	utilidades utilidades = new utilidades(metodosprincipal.getcontrolador());
	
	public PaginaPrincipal() throws Exception {
		
		metodosprincipal.CargandoPaginaWeb();
		
		utilidades.MaximizarPagina();
		
		metodosprincipal.BuscandoIconoprincipal();
		
		utilidades.configurarjs();
		utilidades.setvalidador2(metodosprincipal.getvalidador());
		utilidades.marcacionEvidencia(metodosprincipal.getcontrolador(), metodosprincipal.getvalidador());
		
		utilidades.tomarEvidencia();
		
		metodosprincipal.BuscandoIconoprincipal();
		
		metodosprincipal.EscribirUnElemento();
		
		metodosprincipal.ClickBuscarElemento();
		
	}

}
