package repaso2eva4;

public class uso {

	public static void main(String[] args) {
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


