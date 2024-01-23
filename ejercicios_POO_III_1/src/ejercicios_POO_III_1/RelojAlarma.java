package ejercicios_POO_III_1;

public class RelojAlarma {

	private String horaAlarma;

	private String horaActual;

	private boolean activada;

	public RelojAlarma() {

		horaAlarma = "21:30";
		horaActual = "21:00";
		activada = false;
	}

	public void set_horaActual(String horaActual) {// setter//

		this.horaActual = horaActual;

	}

	public String get_horaActual() {// getter//

		return horaActual;

	}

	public void set_activada(boolean activada) {

		this.activada = activada;

	}

	public String get_activada() {// getter//

		return " la alarma esta activada" + activada;

	}

	public void set_horaAlarma(String nhorasDateTime) {// setter//
		this.horaAlarma = nhorasDateTime;

	}

	public String get_horaAlarma() {// getter//

		return horaAlarma;

	}

	public void verificacionAlarma() {
		if (activada && horaActual.equals(horaAlarma)) {
			System.out.println("La alarma esta sonando");
		} else {
			System.out.println("");
		}
	}
}
