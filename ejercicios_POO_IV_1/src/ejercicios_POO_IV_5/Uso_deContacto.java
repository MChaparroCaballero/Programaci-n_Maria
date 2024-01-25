package ejercicios_POO_IV_5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Uso_deContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contacto> ListaContactos = new ArrayList<>();
		int menu = 0;
		int opcion;

		while (menu < 4) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Desea:  \n1)añadir un contacto \n2)mostrar los contactos \n3)buscar un contacto \n4)salir del menu"));
			switch (opcion) {
			case 1:
				// intenta hacer la accion de añadir un contacto nuevo//
				try {
					// añadimos datos de nuevo contacto desde ventana de dialogo//
					ListaContactos.add(new Contacto(JOptionPane.showInputDialog("Ingrese el nombre").toLowerCase(),
							Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono")),
							JOptionPane.showInputDialog("Ingrese el email")));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error al añadir el contacto: " + e.getMessage());
					// en caso de que algun dato sea introducido mal te muestra una ventana de
					// error//
				}
				break;

			case 2:
				// recorremos la lista de contactos y que nos muestre por ventana de dialogo y
				// consola los datos de cada contacto//
				for (Contacto Conjuntocontactos : ListaContactos) {
					JOptionPane.showMessageDialog(null, "\nNombre: " + Conjuntocontactos.getNombre() + " \ntel: +34 "
							+ Conjuntocontactos.getNum_tel() + " \nEmail:  " + Conjuntocontactos.getEmail());
					System.out.println("-----------------------------------------------------------------------------");
					System.out.println("\nNombre: " + Conjuntocontactos.getNombre() + "\ntel: +34 "
							+ Conjuntocontactos.getNum_tel() + " \nemail: " + Conjuntocontactos.getEmail());
				}

				break;

			case 3:
				try {
					buscarContacto(ListaContactos);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error al buscar el contacto: " + e.getMessage());
				}

				break;

			case 4:
				// cambiamos variable menu para que cerremos bucle menu//
				menu = 4;
			}
		}
	}

	// metodo para buscar contactos//
	private static void buscarContacto(ArrayList<Contacto> ListaContactos) {

		// el string con el nombre de contacto a buscar lo pasamos a minusculas para que
		// de igual//
		String buscar = JOptionPane.showInputDialog("Buscar: ").toLowerCase();

		// recorremos el bucle y si el nombre del contacto es igual que el del elemento
		// a buscar nos lo devuelve y salimos del metodo
		for (Contacto contacto : ListaContactos) {
			if (contacto.getNombre().equalsIgnoreCase(buscar)) {
				JOptionPane.showMessageDialog(null, "Contacto encontrado:\n" + "Nombre: " + contacto.getNombre()
						+ "\nTel: +34 " + contacto.getNum_tel() + "\nEmail: " + contacto.getEmail());
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Contacto no encontrado: ");
	}
}
