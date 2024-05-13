package ejer01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Electrodomestico[] electrodomesticos = new Electrodomestico[3];

        electrodomesticos[0] = new Electrodomestico(280, 10, "azul", 'F');
        electrodomesticos[1] = new Lavadora(200, 20, 25, "rojo", 'F');
        electrodomesticos[2] = new Television(430, 15, 30, true, "negro", 'F');
        /*
        electrodomesticos[3] = new Electrodomestico(120, 8, "gris", 'D');
       
        electrodomesticos[4] = new Lavadora(300, 30, 35, "blanco", 'E');
        electrodomesticos[5] = new Television(700, 40, 60, false, "azul", 'C');
        electrodomesticos[6] = new Electrodomestico(180, 12, "negro", 'F');
        electrodomesticos[7] = new Lavadora(250, 25, 40, "rojo", 'A');
        electrodomesticos[8] = new Television(600, 35, 45, true, "blanco", 'B');
        electrodomesticos[9] = new Electrodomestico(200, 18, "gris", 'E');
*/
        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            if (electrodomestico instanceof Lavadora) {
            	 totalLavadoras+= precioFinal;
            	 totalElectrodomesticos += precioFinal;
            } else if (electrodomestico instanceof Television) {
            	 totalElectrodomesticos += precioFinal;
            	 totalTelevisiones+= precioFinal;
            }
            System.out.println("Precio final: " + precioFinal);
        }

        System.out.println("Total Electrodomesticos: " + totalElectrodomesticos);
        System.out.println("Total Lavadoras: " + totalLavadoras);
        System.out.println("Total Televisiones: " + totalTelevisiones);
    }

}
