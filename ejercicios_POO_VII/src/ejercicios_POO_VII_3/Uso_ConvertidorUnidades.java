package ejercicios_POO_VII_3;

import javax.swing.JOptionPane;

import ejercicios_POO_VII_2.Calculadora;

public class Uso_ConvertidorUnidades {

	public static void main(String[] args) {
		int i = 0;
		int opcion;

		// iniciamos un bucle que nos hace de menu basico//
		while (i < 6) {

			// usuario elige la opcion//
			opcion = Integer.parseInt(JOptionPane.showInputDialog("\n1)Kilometros - milla" + "\n2) Milla - kilometros"
					+ "\n3)Celsius - Farenheit" + "\n4)Farenheit - Celsius" + "\n5)exit"));

			switch (opcion) {
			case 1:
				//nueva instancia,kilometros a millas mete el valor y usamos metodo//
				ConvertidorUnidades KM = new ConvertidorUnidades(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilometros a convertir")));
				ConvertidorUnidades.KilometrosMilla(KM.getTemp1());

				JOptionPane.showMessageDialog(null,
						KM.getTemp1() + " Km " + "\n= " + ConvertidorUnidades.getTempfinal() + " Millas ");

				break;

			case 2:
				//nueva instancia,millas kilometros mete el valor y usamos metodo//
				ConvertidorUnidades MK = new ConvertidorUnidades(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese las millas a convertir")));
				ConvertidorUnidades.MillasKilometros(MK.getTemp1());

				JOptionPane.showMessageDialog(null,
						MK.getTemp1() + " millas " + "\n= " + ConvertidorUnidades.getTempfinal() + " km ");

				break;

			case 3:
				//nueva instancia,Celsius a farenheit mete el valor y usamos metodo//
				ConvertidorUnidades CF = new ConvertidorUnidades(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados a convertir")));
				ConvertidorUnidades.CelsiusFarenheit(CF.getTemp1());

				JOptionPane.showMessageDialog(null,
						CF.getTemp1() + " C " + "\n= " + ConvertidorUnidades.getTempfinal() + " F ");

				break;

			case 4:
				//nueva inatancia,Farenheit mete el valor y usamos metodo//
				ConvertidorUnidades FC = new ConvertidorUnidades(
						Double.parseDouble(JOptionPane.showInputDialog("Ingrese los kilometros a convertir")));
				ConvertidorUnidades.FarenheitCelsius(FC.getTemp1());

				JOptionPane.showMessageDialog(null,
						FC.getTemp1() + " F " + "\n= " + ConvertidorUnidades.getTempfinal() + " C ");

				break;

			case 5:
				JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestra app");
				i = 6;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error, opción invalida");
				break;

			}

		}
	}
}
