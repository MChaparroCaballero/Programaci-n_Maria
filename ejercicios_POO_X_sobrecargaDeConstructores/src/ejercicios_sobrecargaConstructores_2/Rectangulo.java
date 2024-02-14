package ejercicios_sobrecargaConstructores_2;

public class Rectangulo {
	//atributos//
private double ancho;
private double altura;


public Rectangulo(double ancho, double altura) {
	 this.ancho=ancho;
	 this.altura=altura;
	 
}

public Rectangulo(double ancho, double altura, double area) {
	 this.ancho=ancho;
	 area= ancho*altura;
	 this.altura=area;
	 
	 
}

public double getAncho() {
	return ancho;
}

public void setAncho(double ancho) {
	this.ancho = ancho;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

}
