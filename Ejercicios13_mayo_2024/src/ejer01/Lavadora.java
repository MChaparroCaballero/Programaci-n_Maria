package ejer01;


public class Lavadora extends Electrodomestico {

	private double carga;

	public Lavadora() {
		super();
		this.carga = 5;

	}

	public Lavadora(double precio_base, int peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.carga = 5;
	}

	public Lavadora(double precio_base, int peso, String color, char letra, int carga) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = ComprovarColor(color);
		this.miConsumo = ComprovarConsumoEnergetico(letra);
		this.carga = carga;
	}

	public double precioFinal() {
		// TODO Auto-generated method stub

		//asi es como heredas el resultado de un metodo de la clase padre//
		double pf = super.precioFinal();

		if (this.carga > 30) {
			pf += 50;

		}
		return pf;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
