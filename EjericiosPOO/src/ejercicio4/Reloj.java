package ejercicio4;

public class Reloj {

	// ponemos sus atributos//
	String marca;
	boolean digital;
	double precio;
	String dig;
	
	Reloj(){
		marca = "Casio";
		digital = true;
		precio = 50.0;
		
		
		if(digital==true) {
			dig = "es digital";	
		}else {
			dig = "es analogico";
		}
			
		
	}
}
