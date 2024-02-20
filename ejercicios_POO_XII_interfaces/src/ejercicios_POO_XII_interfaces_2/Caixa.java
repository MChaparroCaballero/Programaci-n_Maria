package ejercicios_POO_XII_interfaces_2;

import javax.swing.JOptionPane;

import ejercicios_POO_XII_interfaces_2.ProcesamientosPagos.ProcesadorPago;

public class Caixa implements ProcesadorPago{
public static double dinero = 5000;
String contra = "6665";
double cantidad = 36;
	
	
	@Override
	public void realizarPago() {
		String pinI = JOptionPane.showInputDialog("\nIntroduzca el pin de la tarjeta");
		
		if(contra.equals(pinI)) {
			
			JOptionPane.showMessageDialog(null,  "\nDinero en cuenta: "
					+ Caixa.dinero);
			Caixa.dinero = Caixa.dinero - cantidad;
			JOptionPane.showMessageDialog(null, "\nCantidad de Transaccion: " + cantidad + "\nDinero en cuenta: "
					+ Caixa.dinero);
		}else {
			JOptionPane.showMessageDialog(null, "\nError, fallo de transacción");
		}
		
		
	}

	@Override
	public void reembolsarPago() {
		 Caixa.dinero=Caixa.dinero + cantidad;
		 JOptionPane.showMessageDialog(null,"Reembolso realizado" + "\nDinero en cuenta: "
					+ Caixa.dinero);
	}

}
