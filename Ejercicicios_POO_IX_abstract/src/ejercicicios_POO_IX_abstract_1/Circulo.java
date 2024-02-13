package ejercicicios_POO_IX_abstract_1;

public class Circulo extends FiguraGeometrica{

	
	double radio;
	
	
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
		
	}



	@Override
	public abstract double calcularArea() {
		double resultado = (this.radio * this.radio)* PI.math;
	}
}
