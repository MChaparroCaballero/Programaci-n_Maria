package ejercicicios_POO_IX_abstract_1;

public class Uso_de_clases {

	public static void main(String[] args) {
		Rectangulo R = new Rectangulo(11, 6);
		Circulo C = new Circulo(3);
 
		System.out.println("El área del rectángulo es: " + R.calcularArea());
		System.out.println("El área del círculo es: " + C.calcularArea());
	

	}

}
