package ejercicios_sobrecargaConstructores_1;

public class Empleado {
	//atributos//
	private String nombre;
	private double salario;
	private String departamento;
	
	public Empleado(String nombre, double salario, String departamento) {//constructor 1//
		this.nombre=nombre;
		this.salario=salario;
		this.departamento=departamento;
		
	}
	
	public Empleado(String nombre,double salario, int años_de_antiguedad) {//constructor 2//
		this.nombre=nombre;
		this.salario=salario*años_de_antiguedad;
		
		
	}

	public String getNombre() {//getter//
		return nombre;
	}

	public void setNombre(String nombre) {//setter//
		this.nombre = nombre;
	}

	public double getSalario() {//getter//
		return salario;
	}

	public void setSalario(double salario) {//setter//
		this.salario = salario;
	}

	public String getDepartamento() {//getter//
		return departamento;
	}

	public void setDepartamento(String departamento) {//setter//
		this.departamento = departamento;
	}
	

}
