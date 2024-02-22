package ejercicios_POO_XI_ABSTRACTySOBRECARGA_2intermedio;

public abstract class Empleado {
	private String nombre;
	private int id;
	private double salario;

	public Empleado(String nombre, int id, double salario) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.salario = salario;
	}

	public abstract double CalcularSalario();

	public abstract void MostrarDetalles();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
