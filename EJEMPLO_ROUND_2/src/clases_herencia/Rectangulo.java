package clases_herencia;

public class Rectangulo extends FigurasGeometricas {
private double lado2;
	

	public Rectangulo(double lado1, double lado2) {
	super(lado1);
	this.lado2= lado2;
}

	@Override
	public double area() {//adaptamos el metodo //
		
		return Math.pow(lado1, lado2);
	}

	@Override
	public double perimetro() {
		//adaptamos el metodo//
		return 2*(lado1+lado2);
	}

	@Override
	public String toString() {
		//adaptamos el metodo//
		return "Rec(" + lado1 + ',' + lado2 + ")";
	}

}
