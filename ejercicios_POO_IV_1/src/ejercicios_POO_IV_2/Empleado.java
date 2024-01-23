package ejercicios_POO_IV_2;

public class Empleado {
	private String nombre;
	private int horasTrabajadas;
	private double tarifaHora;
	

	Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
		
	}


	public void set_nombre(String nombre) {//setter//
		this.nombre = nombre;
	}

	public String get_nombre() {//gettter//
		return nombre;

	}
	
	
	public void set_horasTrabajadas( int horasTrabajadas) {//setter//
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	public int get_horasTrabajadas() {//getter//
		return horasTrabajadas;

	}
	
	public void set_tarifaHora(double tarifaHora) {//setter//
		this.tarifaHora = tarifaHora;
	}
	

	public double get_tarifaHora() {//getter//
		return tarifaHora;

	}
}