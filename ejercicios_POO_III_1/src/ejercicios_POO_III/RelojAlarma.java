package ejercicios_POO_III;

public class RelojAlarma {

	private int horaAlarma;
	private int minutosAlarma;
	private int horaActual;
	private int minutosActual;
	private boolean activada;

	RelojAlarma() {
		horaAlarma = 06;
		minutosAlarma = 25;
		horaActual = 10;
		minutosActual = 24;
	}

	
	public void set_minutosAlarma(int minutosAlarma) {// setter//
		this.minutosAlarma = minutosAlarma;
	}

	public int get_minutosAlarma() {// getter//
		return minutosAlarma;
	}
	
	public void set_horaActual(int horaActual) {// setter//
		this.horaActual = horaActual;
	}
	
	public int get_horaActual() {// getter//
		return horaActual;
	}
	
	public void set_minutosActual(int minutosActual) {// setter//
		this.minutosActual = minutosActual;
	}
	
	public int get_minutosActual() {// getter//
		return minutosActual;
	}
	
	public void set_activada (boolean activada) {
		this.activada = activada;
	}
	
	public String get_activada(){
		return " la alarma esta activada" + activada;
	}
	
	
	public void set_horaAlarma(int horaAlarma) {// setter//
		this.horaAlarma = horaAlarma;
	}

	public int get_horaAlarma() {// getter//
		return horaAlarma;
	}
}
