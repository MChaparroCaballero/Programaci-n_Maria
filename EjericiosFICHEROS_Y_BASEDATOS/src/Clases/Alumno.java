package Clases;

import java.time.LocalDate;

public class Alumno {
	private int id;
	private String Nombre;
	private LocalDate Fecha;
	
	public Alumno(int id, String nombre, LocalDate fecha) {
		super();
		this.id = id;
		Nombre = nombre;
		Fecha = fecha;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", Nombre=" + Nombre + ", Fecha=" + Fecha + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public LocalDate getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}
	
	
	
	
}
