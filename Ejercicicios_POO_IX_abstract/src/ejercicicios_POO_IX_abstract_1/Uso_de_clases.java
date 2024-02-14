package ejercicicios_POO_IX_abstract_1;

public class Uso_de_clases {

	public static void main(String[] args) {
		Rectangulo R = new Rectangulo(5, 10);
		Circulo C = new Circulo(5.5);
 
		System.out.println("El área del rectángulo es: " + R.calcularArea());
		System.out.println("El área del círculo es: " + C.calcularArea());
	

	}

}
