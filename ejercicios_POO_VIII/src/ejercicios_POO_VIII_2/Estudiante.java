package ejercicios_POO_VIII_2;

public class Estudiante extends Persona {
	private String carrera;

	public Estudiante(String nombre, int edad, String carrera) {//constructor//
		super(nombre, edad); //atributos de la clase madre//
		this.carrera = carrera;
	}

	public String getCarrera() {//getter//
		return carrera;
	}

	public void setCarrera(String carrera) {//setter//
		this.carrera = carrera;
	}
	
	

}
