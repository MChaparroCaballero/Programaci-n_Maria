package ejercicios_POO_X_sobrecargaDeConstructores_5;

public class Estudiante {
	//atributos//
	private String nombre;
	private String apellido;
	private int edad;
	private double promedioA;

	public Estudiante(String nombre, String apellido, int edad, double promedioA) {//constructor 1//

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.promedioA = promedioA;
	}

	public Estudiante(String nombre, int edad, double promedioA) {//constructor 2//

		this.nombre = nombre;
		this.edad = edad;
		this.promedioA = promedioA;
	}

	public Estudiante(int edad, double promedioA, String nombre) {//constructor 3//

		this.nombre = nombre;
		this.edad = edad;
		this.promedioA = promedioA;
	}
	public String getNombre() {//getter//
		return nombre;
	}

	public void setNombre(String nombre) {//setter//
		this.nombre = nombre;
	}

	public String getApellido() {//getter//
		return apellido;
	}

	public void setApellido(String apellido) {//setter//
		this.apellido = apellido;
	}

	public int getEdad() {//getter//
		return edad;
	}

	public void setEdad(int edad) {//setter//
		this.edad = edad;
	}

	public double getPromedioA() {//getter//
		return promedioA;
	}

	public void setPromedioA(double promedioA) {//setter//
		this.promedioA = promedioA;
	}

}
