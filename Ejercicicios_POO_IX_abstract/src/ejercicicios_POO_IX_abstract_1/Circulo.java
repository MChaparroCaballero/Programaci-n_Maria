package ejercicicios_POO_IX_abstract_1;

public class Circulo extends FiguraGeometrica {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double calcularArea() {
		return Math.PI * radio * radio;
	}

}
