package ejercicios_POO_VIII_2;

public class Persona {
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {//constructor//
		this.nombre=nombre;
		this.edad=edad;
	}


	public String getNombre() {//getter//
		return nombre;
	}


	public void setNombre(String nombre) {//setter//
		this.nombre = nombre;
	}


	public int getEdad() {//getter//
		return edad;
	}


	public void setEdad(int edad) {//setter//
		this.edad = edad;
	}
	
}
