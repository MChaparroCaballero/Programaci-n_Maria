package ejercicios_POO_VI_4;

import javax.swing.JOptionPane;

import ejercicios_POO_VI_1.Calculadora_Impuestos;

public class Uso_Calculadora_descuentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int opcion;

		while (i < 2) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Para calcular el precio total con descuentos 1, para salir de la aplicacion pulse 2"));
			switch (opcion) {
			case 1:
				// utiliza la aplicacion//
				// instanciamos un nuevo objeto y le meteremos por pantalla el nombre y el
				// precio pero el porcentaje sera predefinido porque es final//
				Calculadora_descuentos productos = new Calculadora_descuentos(
						JOptionPane.showInputDialog("Ingrese el nombre del producto"),
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unidad del producto")),
						Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto")));

				// imprimos los datos del objeto con el precio unidad aun no esta el precio total//
				JOptionPane.showMessageDialog(null,
						"\nNombre: " + productos.getNombre() + "\nprecio unidad: " + productos.getPrecio()
								+ "\ncantidad: " + productos.getCantidad() + "\nporcentaje a aplicar: "
								+ productos.getPorcentaje() +"%");

				if(productos.getCantidad()>5) {
					
				
				/*
				 * multiplicamos el precio unidad por las cantidades a comprar y ese es el
				 * precio total osea el nuevo precio
				 */
				productos.setPrecio(productos.getPrecio() * productos.getCantidad());
				/*actualizamos el precio aplicando un descuento del 10% al precio total*/
				productos.setPrecio(productos.getPrecio() - ((productos.getPrecio() * productos.getPorcentaje()) / 100));

				// imprimimos los datos del objetos despues de aplicar el impuesto sobre el
				// precio//
				JOptionPane.showMessageDialog(null, "\nNombre: " + productos.getNombre() + "\nprecio total con descuento aplicado: "
						+ productos.getPrecio() + "\nporcentaje aplicado: " + productos.getPorcentaje() + "%");

			}else {
				JOptionPane.showMessageDialog(null, "error no se puede aplicar el descuento "+ "\nNombre: " + productos.getNombre() + "\nprecio total "
						+ productos.getPrecio() + "\nporcentaje aplicado: " + productos.getPorcentaje() + "%");
			}
				break;
			case 2:
				// cuando el usuario elige no calcular impuestos mostrara un mensaje y se
				// terminara el programa//
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestra app");
				i = 2;
				break;
				//.//		
				}
		}

	}

}
