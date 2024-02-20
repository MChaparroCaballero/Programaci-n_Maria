package ejercicios_POO_XII_interfaces_2;

import javax.swing.JOptionPane;

import ejercicios_POO_XII_interfaces_2.ProcesamientosPagos.ProcesadorPago;

public class Santander implements ProcesadorPago {
	public static double dinero = 12000;
	String contra = "12345";
	double cantidad = 50;

	@Override
	public void realizarPago() {
		String pinI = JOptionPane.showInputDialog("\nIntroduzca el pin de la tarjeta");

		if (contra.equals(pinI)) {
			JOptionPane.showMessageDialog(null,  "\nDinero en cuenta: "
					+ Santander.dinero);
			Santander.dinero = Santander.dinero - cantidad;
			JOptionPane.showMessageDialog(null,
					"\nCantidad de Transaccion: " + cantidad + "\nDinero en cuenta: " + Santander.dinero);
		} else {
			JOptionPane.showMessageDialog(null, "\nError, fallo de transacción");
		}

	}

	@Override
	public void reembolsarPago() {
		Santander.dinero=Santander.dinero + cantidad;
		 JOptionPane.showMessageDialog(null,"Reembolso realizado" +"\nDinero en cuenta: "
					+ Santander.dinero);

	}

}
