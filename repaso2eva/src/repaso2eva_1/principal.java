package repaso2eva_1;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		/*
		 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
		 * de la primera. Para la clase Vehiculo, crea los atributos de clase
		 * vehiculosCreados y kilometrosTotales, así como el atributo de instancia
		 * kilometrosRecorridos. Crea también algún método específico para cada una de
		 * las subclases. Prueba las clases creadas mediante un programa con un menú
		 * como el que se muestra a continuación:
		 */
		ArrayList<Vehiculo> flota = new ArrayList<Vehiculo>();
		flota.add(new Coche(1500));
		flota.add(new Coche(1300));
		flota.add(new Bicicleta(12));

	}

}
