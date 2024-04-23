package ejer01;

import java.util.Scanner;

public class Uso_zona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Zona principal = new Zona(1000);
		Zona compraventa = new Zona(200);
		Zona vip = new Zona(25);
		int z = 0;
		int operacion;
		int zona;
		
		while (z < 3) {
			System.out.println("\n1.Mostrar numero de entradas libre" + "\n2.Vender entradas" + "\n3.Salir");
			operacion = sc.nextInt();
			switch (operacion) {
			case 1:
				System.out.println("Hay " + principal.getEntradasPorVender() + " libres en la zona principal");
				System.out.println("Hay " + compraventa.getEntradasPorVender() + " libres en la zona de compraventa");
				System.out.println("Hay " + vip.getEntradasPorVender() + " libres en la zona vip");
				break;
				
			case 2:
				System.out.println("De que zona quiere entradas, 1.principal, 2.compraventa, 3.vip?");
				zona = sc.nextInt();
				int cantidad;
				switch (zona) {
				case 1:
					System.out.println("cuantas entradas quiere?");
					cantidad = sc.nextInt();
					principal.vender(cantidad);
					break;
				case 2:
					System.out.println("cuantas entradas quiere?");
					cantidad = sc.nextInt();
					compraventa.vender(cantidad);
					break;
				case 3:
					System.out.println("cuantas entradas quiere?");
					cantidad = sc.nextInt();
					vip.vender(cantidad);
					break;
				}
				break;
				
			case 3:
				z = 3;
			}

		}
	}

}
