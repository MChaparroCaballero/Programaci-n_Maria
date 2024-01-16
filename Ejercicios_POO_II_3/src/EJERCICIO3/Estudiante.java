package EJERCICIO3;

public class Estudiante {

	private String Nombre;
	private int Edad;
	private double calificacion;

	Estudiante() {
		Nombre = "Alicia";
		Edad = 24;
		calificacion = 8.9;
	}

	public void set_Nombre(String nNombre) {
		this.Nombre = nNombre;

	}

	public String get_nombre() {
		return " es " + Nombre;
	}

	public void set_Edad(int nEdad) {
		this.Edad = nEdad;

	}

	public String get_Edad() {
		return " es " + Edad;
	}

	public void set_calificacion(double ncalificacion) {
		this.calificacion = ncalificacion;

	}

	public String get_calificacion() {
		return " es " + calificacion;
	}
}
