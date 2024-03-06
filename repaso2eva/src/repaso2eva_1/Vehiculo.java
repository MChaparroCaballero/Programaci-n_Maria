package repaso2eva_1;

public class Vehiculo {
private int vehiculoscreados;
private double kilometrosTotales;
private static double kilometrosRecorridos;

public Vehiculo(int vehiculoscreados, double kilometrosTotales, double kilometrosReorridos) {
	super();
	this.vehiculoscreados = vehiculoscreados;
	this.kilometrosTotales = kilometrosTotales;
	this.kilometrosRecorridos = kilometrosRecorridos;
}
public int getVehiculoscreados() {
	return vehiculoscreados;
}
public void setVehiculoscreados(int vehiculoscreados) {
	this.vehiculoscreados = vehiculoscreados;
}
public double getKilometrosTotales() {
	return kilometrosTotales;
}
public void setKilometrosTotales(double kilometrosTotales) {
	this.kilometrosTotales = kilometrosTotales;
}
public static double getKilometrosRecorridos() {
	return kilometrosRecorridos;
}
public static void setKilometrosRecorridos(double kilometrosRecorridos) {
	Vehiculo.kilometrosRecorridos = kilometrosRecorridos;
}


}
