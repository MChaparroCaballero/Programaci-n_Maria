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
		
		//comprobamos que el pin de la tarjeta coincida con el que itnroduce si funciona le deja hacer pagos//
		if(contra.equals(pinI)){
			//mostramso el dinero en cuenta antes de hacer la transacción//
			JOptionPane.showMessageDialog(null,  "\nDinero en cuenta: "
					+ Caixa.dinero);
			//actualizamo el dinero en cuenta//
			Caixa.dinero = Caixa.dinero - cantidad;
			JOptionPane.showMessageDialog(null, "\nCantidad de Transaccion: " + cantidad + "\nDinero en cuenta: "
					+ Caixa.dinero);
		}else {
			JOptionPane.showMessageDialog(null, "\nError, fallo de transacción");
		}
		
		
	}

	@Override
	public void reembolsarPago() {
		//actualizamos el dinero en cuenta//
		 Caixa.dinero=Caixa.dinero + cantidad;
		 JOptionPane.showMessageDialog(null,"Reembolso realizado" + "\nDinero en cuenta: "
					+ Caixa.dinero);
	}

}
