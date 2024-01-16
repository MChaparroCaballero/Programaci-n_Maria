package ejericiosPOO_II;

public class Automovil {
	
	private String marcas;
	private String modelo;
	
	
	Automovil(){
		marcas= "ford";
		modelo= "mustang";
	}
	
	public String get_marcas() {
		return "la marca es " + marcas;	
	}
	
	public void set_marcas (String marcas) {
		 marcas = "Honda";
	}
	
	public String get_modelo() {
		return "el modelo es " + modelo;
	}
	
	public void set_modelo(String modelo) {
		modelo = "impala";
	}
	
	

}
