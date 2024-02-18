package ejercicicios_POO_IX_abstract_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Uso_dePersistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable al azar para el primer bucle menu//
		int x = 0;
		while (x < 3) {
			int option = Integer.parseInt(JOptionPane.showInputDialog(null,
					"\n1)Guardar dato en archivo" + "\n2)Guardar dato en base de datos" + "\n3)salir"));

			switch (option) {
			case 1:
				// variable al azar para bucle menu//
				int b = 0;
				// nueva instancia//
				PersistenciaArchivo nuevoarchivo = new PersistenciaArchivo();
				while (b < 3) {
					int eleccion = Integer.parseInt(
							JOptionPane.showInputDialog(null, "\n1)Guardar dato" + "\n2)Cargar dato" + "\n3)salir"));
					switch (eleccion) {
					case 1:
						// guardamos dato//
						nuevoarchivo.setDatos(JOptionPane.showInputDialog(null, "\nGuardar dato: "));
						break;
					case 2:
						// cargamos dato//
						JOptionPane.showMessageDialog(null, nuevoarchivo.getDatos());
						break;
					case 3:
						// salimos de menu de acciones de archivo//
						b = 3;
						break;
					}
				}
				break;
			case 2:
				// variable al azar para bucle menu//
				int y = 0;
				// nueva instancia//
				PersistenciaBasedeDatos nuevoBasededatos = new PersistenciaBasedeDatos();
				ArrayList<String> BD = new ArrayList<>();
				while (y < 3) {
					int eleccion2 = Integer.parseInt(
							JOptionPane.showInputDialog(null, "\n1)Guardar dato" + "\n2)Cargar dato" + "\n3)salir"));
					switch (eleccion2) {
					case 1:
						// guardamos dato//
						nuevoBasededatos.setDatos(JOptionPane.showInputDialog(null, "\nGuardar dato: "));
						BD.add(nuevoBasededatos.getDatos());
						break;
					case 2:
						// cargamos datos//
						JOptionPane.showMessageDialog(null, BD);
						break;
					case 3:
						// salimos de menu de acciones de base de datos//
						y = 3;
						break;
					}
				}
				break;
			case 3:
				// salimos de el menu de opciones y app cierrar//
				x = 3;
				break;

			}
		}

	}

}
