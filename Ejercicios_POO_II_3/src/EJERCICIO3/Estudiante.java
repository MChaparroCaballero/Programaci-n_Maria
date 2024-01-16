package EJERCICIO3;

public class Estudiante {//atributos//

	private String Nombre;
	private int Edad;
	private double calificacion;

	Estudiante() {//constructor//
		Nombre = "Alicia";
		Edad = 24;
		calificacion = 8.9;
	}

	public void set_Nombre(String Nombre) {//setter//
		this.Nombre = Nombre;

	}

	public String get_nombre() {//getter//
		return " es " + Nombre;
	}

	public void set_Edad(int Edad) {//setter//
		if (Edad >= 0) {//restringimos su funcionamiento en caso de edad negativa//
			this.Edad = Edad;
		} else {
			System.out.println("Error no existen edades negativas");
			this.Edad = (Integer) null;
		}

	}

	public String get_Edad() {//getter//
		return " es " + Edad;
	}

	public void set_calificacion(double calificacion) {//setter//
		if (calificacion >= 0 && calificacion <= 100) {//restringimos su funcionamiento en caso de estar fuera del intervalo deseado//
			this.calificacion = calificacion;
		} else {
			System.out.println("Error esta fuera del rango de calificaciones");
			this.calificacion = (Double) null;
		}

	}

	public String get_calificacion() {//getter//
		return " es " + calificacion;
	}
}
