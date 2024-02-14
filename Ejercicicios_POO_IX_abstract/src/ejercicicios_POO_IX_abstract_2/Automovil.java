package ejercicicios_POO_IX_abstract_2;
import java.util.*;
import javax.swing.JOptionPane;

public class Automovil extends Vehiculo {
 double velocidad;

public Automovil(double velocidad) {
	this.velocidad = velocidad;
}

@Override
public void acelerar() {
	
	velocidad +=1;
	JOptionPane.showMessageDialog(null, "\nvelocidad " + velocidad + "\nBROOM");
}

@Override
public void frenar() {
	 velocidad -= 1;
	 JOptionPane.showMessageDialog(null, "\nvelocidad " + velocidad + "\nScreeeeeee");
}


 
}
