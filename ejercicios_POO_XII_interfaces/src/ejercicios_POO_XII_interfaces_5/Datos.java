package ejercicios_POO_XII_interfaces_5;

import ejercicios_POO_XII_interfaces_5.Interfaces_clase.Filtrable;
import ejercicios_POO_XII_interfaces_5.Interfaces_clase.Ordenable;
import javax.swing.JOptionPane;

public class Datos implements Filtrable, Ordenable {

	@Override
	public void ordenar() {
		JOptionPane.showMessageDialog(null, "Ordenando datos");

	}

	@Override
	public void filtrar() {
		JOptionPane.showMessageDialog(null, "Filtrando datos");

	}

}
