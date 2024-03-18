package repaso2eva4;

public class uso {

	public static void main(String[] args) {
		/*
		 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
		 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
		 * cuatro quesos o funghi - y su estado - pedida o servida. La clase debe
		 * almacenar información sobre el número total de pizzas que se han pedido y que
		 * se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
		 */
		Pizza pizza1 = new Pizza("MARGARITA", "MEDIANA");
		Pizza pizza2 = new Pizza("CUATRO_QUESOS", "FAMILIAR");

		pizza1.imprimirInfo();
		pizza2.imprimirInfo();

		// Marcar una pizza como servida
		pizza1.servir();
		pizza1.imprimirInfo();

		// Intentar marcar la misma pizza como servida nuevamente
		pizza1.servir();

		// Imprimir el número total de pizzas pedidas y servidas
		System.out.println("\nTotal de pizzas pedidas: " + Pizza.getTotalPedidas());
		System.out.println("Total de pizzas servidas: " + Pizza.getTotalServidas());
	}
}
