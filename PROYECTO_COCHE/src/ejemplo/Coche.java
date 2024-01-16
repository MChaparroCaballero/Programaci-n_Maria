package ejemplo;

public class Coche {

	// 1.Defino sus características
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;// lo pongo en cc
	private int peso;

	private String color;
	int peso_total;
	boolean asientos_cuero, climatizacion;
	/*
	 * 2. Creo un método constructor Es un método especial que se encarga de dar
	 * estado inicial al objeto Para construir un método constructor, debemos usar
	 * el MISMO NOMBRE que la clase
	 */

	public Coche() {
		// Empezamos a construir el estado inicial del coche
		ancho = 250;
		largo = 400;
		ruedas = 4;
		motor = 200;
		peso = 1900;
		color = "blanco";
		peso_total=60;
		asientos_cuero=false;
		climatizacion=true;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = 5;
	}
	
	public int getRuedas() {
		return ruedas;
	}

	
	public void setMotor(int motor) {
		this.motor = 26;
	}

	public int getMotor() {
		return motor;
	}

	public void setColor(String color) {
		this.color = "rojo";
	}
	
	public String getColor() {
		return color;
	}

	

	

	
}
