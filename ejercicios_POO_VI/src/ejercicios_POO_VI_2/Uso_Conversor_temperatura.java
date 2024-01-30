package ejercicios_POO_VI_2;

import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.*;

import javax.swing.JOptionPane;

public class Uso_Conversor_temperatura {

	public static void main(String[] args) {

		// instancio nuevo objeto metiendo dato de solo los grados en celsius//
		Conversor_temperatura temp1 = new Conversor_temperatura(
				Double.parseDouble(JOptionPane.showInputDialog("Ponga los grados en celsisus que quiere que pasar")));

		/*
		 * cambiamos el valor del objeto con el setter usando los valores fijos del de
		 * ajuste y factor de conversion ponienod el nuevo valor en farenheit
		 */
		temp1.setTemperatura((temp1.getTemperatura() * temp1.getFactor_conversion()) + temp1.getAjuste());
		
		//imprimimos el nuevo valor en farenheit//
		JOptionPane.showMessageDialog(null, "\n Temperatura en farenheit: " + temp1.getTemperatura());

	}

}
