package ejericiosPOO_II;

public class Automovil {
	
	private String marcas;
	private String modelo;
	
	
	Automovil(){
		marcas= "ford";
		modelo= "mustang";
	}
	
	public void set_marcas (String nmarcas) {
		 nmarcas= "Honda";
		 this.marcas = nmarcas;
	}
	public String get_marcas() {
		return "es " + marcas;	
	}
	
	public void set_modelo(String nmodelo) {
		nmodelo = "impala";
		this.modelo = nmodelo;
	}
	
	public String get_modelo() {
		return "es " + modelo;
	}
	
	
	
	

}
