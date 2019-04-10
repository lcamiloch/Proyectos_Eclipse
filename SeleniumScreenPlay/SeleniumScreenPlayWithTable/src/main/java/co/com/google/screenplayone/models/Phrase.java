package co.com.google.screenplayone.models;

public class Phrase {
	
	private String cadenaUno;
	private String cadenaDos;
	
	
	public Phrase(String cadenaUno, String cadenaDos) {
		
		this.cadenaUno = cadenaUno;
		this.cadenaDos = cadenaDos;
	}
	
	public String getCadenaUno() {
		
		return cadenaUno;
	}
	
	public void setCadenaUno(String CadenaUno) {
		
		this.cadenaUno = CadenaUno;
	}
	
public String getCadenaDos() {
		
		return cadenaDos;
	}
	
	public void setCadenaDos(String CadenaDos) {
		
		this.cadenaDos = CadenaDos;
	}

}
