package ejercicios_POO_III_1;

import java.time.LocalDateTime;

public class RelojAlarma {

	private LocalDateTime horaAlarma;

	private LocalDateTime horaActual;

	private boolean activada;

	public RelojAlarma() {

		horaAlarma = LocalDateTime.now();

		horaActual = LocalDateTime.now();

	}

	public void set_horaActual(LocalDateTime horaActual) {// setter//

		this.horaActual = horaActual;

	}

	public LocalDateTime get_horaActual() {// getter//

		return horaActual;

	}

	public void set_activada(boolean activada) {

		this.activada = activada;

	}

	public String get_activada() {// getter//

		return " la alarma esta activada" + activada;

	}

	public void set_horaAlarma(LocalDateTime nhorasDateTime) {// setter//
		this.horaAlarma = nhorasDateTime;

	}

	public LocalDateTime get_horaAlarma() {// getter//

		return horaAlarma;

	}

}
