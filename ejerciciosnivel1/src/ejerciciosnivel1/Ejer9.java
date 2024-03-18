package ejerciciosnivel1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
//Lee un numero por teclado que pida el precio de un producto(puede tener decimales) y calcula el precio final con el IVA. el Iva sera una constante del 21%

		System.out.println("Ingrese un precio sin iva y nosotros se lo calculamos con el iva");
		Scanner lector;
		lector = new Scanner(System.in);
		float precio = lector.nextFloat();
		lector.close();
		float iva = (float) (precio * 0.21);
		float PrecioConIva = precio + iva;
		System.out.println("El precio de ese producto con iva incluido es " + PrecioConIva + " euros");

	}

}
