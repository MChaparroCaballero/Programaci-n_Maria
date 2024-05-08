package ejer01;

import java.util.Scanner;

public class Uso_zona {

	static Scanner sc = new Scanner(System.in);

	public static int menu(String opciones[]) {
		int op;
		do {
			// imprimimos de un array todas sus opciones//
			for (String item : opciones)
				System.out.println(item);
			// le pedimos que eliga una//
			System.out.println("\n\tIndique la operación a realizar");
			// guardamos su opcion//
			op = Integer.valueOf(sc.nextLine());

		} while (op < 1 || op > opciones.length);

		// mientras que la opcion sea mayor que 1 o menor que el numer de opciones sera
		// valido//
		return op;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string del menu 1 y el menu 2//
		String opc[] = { "1.Mostrar numero de entradas libre", "2.Vender entradas", "3.Salir" };

		String zonas[] = { "1.Zona Principal", "2.Zona compra-venta", "3.Zona VIP", "4.Salir" };

		// las tres zonas//
		Zona principal = new Zona(1000);
		Zona compraventa = new Zona(200);
		Zona vip = new Zona(25);

		// los menus//
		int operacion;
		int zona;

		// string de fallos//
		String basura;

		do {
			// menu principal//
			operacion = menu(opc);
			switch (operacion) {
			case 1:
				// imprimimos el numero de entradas que hay//
				System.out.println("Hay " + principal.getEntradasPorVender() + " libres en la zona principal");
				System.out.println("Hay " + compraventa.getEntradasPorVender() + " libres en la zona de compraventa");
				System.out.println("Hay " + vip.getEntradasPorVender() + " libres en la zona vip");
				break;

			case 2:

				// menu secundario//
				do {
					zona = menu(zonas);

					int cantidad;
					switch (zona) {
					case 1:
						// le pedimos la cantidad y usamos nuestro metodo para reducir las entradas de
						// esa zona//
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

					case 4: // salimos del menu secundario//
						break;

					}
					if (zona != zonas.length) {// si la opcion del menu secundario elegida es diferente a la opcion
												// maxima nos manda este mensajito eso es simplemente en caso de
												// errores//
						System.out.println("Presione una tecla para continuar.");
						basura = sc.nextLine();
					}

				} while (zona != zonas.length);//por cuanto nos hace el menu//

				break;

			case 3:

				break;

			}
			if (operacion != opc.length) {//de nuevo en caso de errores de opcion pero para el principal//
				System.out.print("Presione una tecla para continuar.");
				basura = sc.nextLine();
			}

		} while (operacion != opc.length);//duracion del menu principal osea hasta que de al exit//

	}
}
