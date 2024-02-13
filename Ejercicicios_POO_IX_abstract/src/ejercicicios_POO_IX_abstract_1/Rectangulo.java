package ejercicicios_POO_IX_abstract_1;

public class Rectangulo extends FiguraGeometrica{
	double largo;
	double ancho;
	
	

	public Rectangulo(double x, double y, double largo, double ancho) {
		super(x, y);
		this.largo = largo;
		this.ancho = ancho;
	}

	@Override
	public abstract double calcularArea() {
		double resultado = largo * ancho;
	}
}
