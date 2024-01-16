package ejericiosPOO_II;

public class Automovil {//atributos//
	
	private String marcas;
	private String modelo;
	
	
	Automovil(){//constructor//
		marcas= "ford";
		modelo= "mustang";
	}
	
	public void set_marcas (String marcas) {//setter//
		 this.marcas = marcas;
	}
	
	public String get_marcas() {//getter/
		return "es " + marcas;	
	}
	
	public void set_modelo(String modelo) {//setter//
		this.modelo = modelo;
	}
	
	public String get_modelo() {//getter//
		return "es " + modelo;
	}
	
	
	
	

}
