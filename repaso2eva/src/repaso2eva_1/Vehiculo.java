package repaso2eva_1;

public abstract class Vehiculo {
	private static int vehiculoscreados = 0;
	private static double kilometrosTotales =0;
	private double kilometrosRecorridos;

	public Vehiculo() {
		super();
		this.kilometrosRecorridos = 0;
	}

	public static int getVehiculoscreados() {
		return vehiculoscreados;
	}

	public static void setVehiculoscreados(int vehiculoscreados) {
		Vehiculo.vehiculoscreados = vehiculoscreados;
	}

	public static double getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(double kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public void recorre(int k) {
		this.kilometrosRecorridos = +k;
		Vehiculo.kilometrosTotales = +k;
	}

}