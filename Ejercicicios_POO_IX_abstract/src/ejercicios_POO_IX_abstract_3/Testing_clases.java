package ejercicios_POO_IX_abstract_3;

import javax.swing.JOptionPane;

public class Testing_clases {

	public static void main(String[] args) {
		
		//variables para bucle random y para switch de que animal quieres//
		int x = 0;
		int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1)😸 Gato" + "\n2)🐶 Perro"));

		switch (eleccion) {
		case 1:
			//instanciamos una clase gato y denro del bucle le ponemos un menu de acciones//
			Gato whiskas = new Gato(JOptionPane.showInputDialog(null, "\nNombre: "));

			while (x < 3) {
				int opcion = Integer.parseInt(
						JOptionPane.showInputDialog(null, "\n1)Atacar" + "\n2)Hacer sonido " + "\n3)Salir por patas"));
				switch (opcion) {
				case 1:
					whiskas.moverse();
					break;

				case 2:
					whiskas.hacerSonido();
					break;

				case 3:
					x = 3;
					break;
				}
			}

			break;

		case 2:
			//instanciamos una clase perro y denro del bucle le ponemos un menu de acciones//
			Perro Piti = new Perro(JOptionPane.showInputDialog(null, "\nNombre: "),
					JOptionPane.showInputDialog(null, "\nDueño: "));

			while (x < 3) {
				int opcion = Integer.parseInt(
						JOptionPane.showInputDialog(null, "\n1)Reacciona" + "\n2)Hacer sonido " + "\n3)Salir por patas"));
				switch (opcion) {
				case 1:
					Piti.moverse();
					break;

				case 2:
					Piti.hacerSonido();
					break;

				case 3:
					x = 3;
					break;
				}
			}
			
			break;
		}

	}

}
