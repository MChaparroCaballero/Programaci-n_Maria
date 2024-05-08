package clases;

import java.time.LocalDate;

public class Empleado {

	private int id;
	private String nombre;
	private double salario;
	private LocalDate fecha;

	public Empleado(int id, String nombre, double salario, LocalDate fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.fecha = fecha;
	}

	public Empleado(String nombre, double salario, LocalDate fecha) {
		super();
		this.id = 888;
		this.nombre = nombre;
		this.salario = salario;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSalario() {
		return salario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "empleado [id=" + id + ", nombre=" + nombre + ", salario=" + salario + ", fecha=" + fecha + "]";
	}

}
