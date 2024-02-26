package clases_herencia;

public class Cuadrado extends FigurasGeometricas{

	public Cuadrado(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		//adaptamos el metodo//
		return Math.pow(lado1, 2);
	}

	@Override
	public double perimetro() {
		//adaptamos el metodo//
		return 4 * lado1;
	}

}
