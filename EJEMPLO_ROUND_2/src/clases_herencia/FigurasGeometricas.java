package clases_herencia;

public abstract class FigurasGeometricas {
	protected double lado1;//atributo//

	public FigurasGeometricas(double lado1) {//constructor//
		super();
		this.lado1 = lado1;
	}

	public double getLado1() {//getter//
		return lado1;
	}

	public void setLado1(double lado1) {//setter//
		this.lado1 = lado1;
	}

	public abstract double area();//metodo abstracto//

	public abstract double perimetro();//metodo abstracto//

	@Override
	public String toString() {//devolvemos en string//
		return "FigurasGeometricas [lado1=" + lado1 + "]";
	}

}
