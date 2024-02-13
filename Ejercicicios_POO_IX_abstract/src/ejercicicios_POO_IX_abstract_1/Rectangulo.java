package ejercicicios_POO_IX_abstract_1;

public class Rectangulo extends FiguraGeometrica{
	double largo;
	double ancho;
	
	public Rectangulo(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
 
	public double calcularArea() {
		return largo * ancho;
	}
}
 

	