package ejer01;

import java.util.Scanner;

public class Uso_zona {

	static Scanner sc = new Scanner(System.in);

	public static int menu(String opciones[]) {
		int op;
		do {
			for (String item : opciones)
				System.out.println(item);
			System.out.println("\n\tIndique la opción a realizar");
			op = Integer.valueOf(sc.nextLine());

		} while (op < 1 || op > opciones.length);

		return op;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opc[] = { "1.Mostrar numero de entradas libre", "2.Vender entradas", "3.Salir" };

		String zonas[] = { "1.Zona Principal", "2.Zona compra-venta", "3.Zona VIP","4.Salir" };
		Zona principal = new Zona(1000);
		Zona compraventa = new Zona(200);
		Zona vip = new Zona(25);
		int operacion;
		int zona;
		String basura;

		do {
			operacion = menu(opc);
			switch (operacion) {
			case 1:
				System.out.println("Hay " + principal.getEntradasPorVender() + " libres en la zona principal");
				System.out.println("Hay " + compraventa.getEntradasPorVender() + " libres en la zona de compraventa");
				System.out.println("Hay " + vip.getEntradasPorVender() + " libres en la zona vip");
				break;

			case 2:

				do {
					zona = menu(zonas);

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
						
					case 4: 
						break;

					}
					if (zona != zonas.length) {
						System.out.println("Presione una tecla para continuar.");
						basura = sc.nextLine();
					}

				} while (zona != zonas.length);

				break;

			case 3:

				break;

			}
			if (operacion != opc.length) {
				System.out.print("Presione una tecla para continuar.");
				basura = sc.nextLine();
			}

		} while (operacion != opc.length);

	}
}
