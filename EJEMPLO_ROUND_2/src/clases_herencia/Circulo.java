package clases_herencia;

public class Circulo extends FigurasGeometricas {
	

	public Circulo(double lado1) {
		super(lado1);
		
	}

	@Override
	public double area() {
		// adaptamos el metodo area//
		return Math.PI*Math.pow(lado1, 2);
	}

	@Override
	public double perimetro() {
		
		return 2*Math.PI*lado1;
	}

	@Override
	public String toString() {
		return "Circulo de radio=" + lado1;
	}

	
}
