package ejer01;

public class Principal {
	static Electrodomestico[] ld = new Electrodomestico[10];

	public static void imprimir() {
		for (Electrodomestico e : ld)
			System.out.println(e.precioFinal());
	}

	public static void imprimirVarios() {
		double suma_lavadoras = 0;
		double suma_televisores = 0;
		double suma_electrodomesticos = 0;
		for (Electrodomestico e : ld) {
			if (e instanceof Lavadora) {
				suma_lavadoras += e.precioFinal();
			} else if (e instanceof Televisor) {
				suma_televisores += e.precioFinal();
			} else {
				suma_electrodomesticos += e.precioFinal();
			}
		}
		System.out.println("la suma de los precios de las lavadoras es= " + suma_lavadoras);
		System.out.println("la suma de los precios de los televisores es= " + suma_televisores);
		System.out.println("la suma de los precios de los eletrodomesticos son= " + suma_electrodomesticos);

	}

	public static void cargar() {
	    ld[0] = new Electrodomestico();
        ld[1] = new Electrodomestico(100, 20, "ROJO", 'A');
        ld[2] = new Electrodomestico(200, 30, "VERDE", 'B');
        ld[3] = new Lavadora(300, 20, "ROJO", 'F', 35);
        ld[4] = new Electrodomestico(400, 50, "NEGRO", 'D');
        ld[5] = new Lavadora(200, 20, "AZUL", 'E', 45);
        ld[6] = new Electrodomestico(300, 40, "BLANCO", 'C');
        ld[7] = new Televisor(400, 5, "NEGRO", 'A', 30, false);
        ld[8] = new Electrodomestico(100, 20, "ROJO", 'G');
        ld[9] = new Televisor(350, 5, "VERDE", 'C', 30, true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cargar();
		imprimirVarios();

	}

}
