package ejercicios_POO_VI_1;

public class Calculadora_Impuestos {

	private String nombre;
	private double precio;
	private final int porcentaje;
	
	//55//
	public Calculadora_Impuestos(String nom, double precio,int porcentaje) {
		nombre = nom;
		this.precio = precio;
		this.porcentaje= porcentaje;
	}


	public String getNombre() {//getter//
		return nombre;
	}


	public void setNombre(String nombre) {//setter//
		this.nombre = nombre;
	}


	public double getPrecio() {//getter//
		return precio;
	}

	public int getporcentaje() {
		return porcentaje;
	}

	public void setPrecio(double precio) {//setter//
		this.precio = precio;
	}
	
}
