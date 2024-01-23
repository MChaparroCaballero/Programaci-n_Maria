package ejercicios_POO_IV_3;

public class Curso {
	private String nombre;
	private double calificacion;

	public Curso() {

		this.nombre = "";
		this.calificacion = 0;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}
	
	}


