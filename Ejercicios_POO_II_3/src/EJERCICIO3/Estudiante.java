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
		if(nEdad>=0) {
			this.Edad = nEdad;	
		}else {
			System.out.println("Error no existen edades negativas");
			this.Edad=(Integer) null;
		}
		

	}

	public String get_Edad() {
		return " es " + Edad;
	}

	public void set_calificacion(double ncalificacion) {
		if(ncalificacion>=0 && ncalificacion <=100) {
			this.calificacion = ncalificacion;	
		}else {
			System.out.println("Error esta fuera del rango de calificaciones");
			this.calificacion= (Double) null;
		}
		

	}

	public String get_calificacion() {
		return " es " + calificacion;
	}
}
