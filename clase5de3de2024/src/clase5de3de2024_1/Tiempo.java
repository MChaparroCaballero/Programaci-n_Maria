package clase5de3de2024_1;

public class Tiempo {
	private static int horas;
	private static int minutos;
	private static int segundos;

	public Tiempo(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public static void suma(int s, int m, int h) {

		segundos = segundos + s;
		if (Tiempo.segundos >= 60) {
			Tiempo.minutos = Tiempo.minutos + 1;
			Tiempo.segundos = 0;
		} else {

		}
		Tiempo.minutos = minutos + m;

		if (Tiempo.minutos >= 60) {
			Tiempo.horas = Tiempo.horas + 1;
			Tiempo.minutos = 0;
		}

		Tiempo.horas = horas + h;

	}
	
	public static void restar(int s, int m, int h) {

		Tiempo.segundos = segundos - s;
		if (Tiempo.segundos > 0) {
			Tiempo.minutos = Tiempo.minutos - 1;
			Tiempo.segundos = 59;
		} else {

		}
		Tiempo.minutos = minutos - m;

		if (Tiempo.minutos > 0) {
			Tiempo.horas = Tiempo.horas - 1;
			Tiempo.minutos = 59;
		}

		Tiempo.horas = horas - h;

	}

	@Override
	public String toString()  {
		return "Tiempo [Horas=" + Tiempo.horas + ", minutos=" + Tiempo.minutos + ", Segundos="
				+ Tiempo.segundos + "]";
	}
	
	
}
