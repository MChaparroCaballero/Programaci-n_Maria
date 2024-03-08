package repaso2eva_1;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList<Vehiculo> flota= new ArrayList<Vehiculo>();
		flota.add(new Coche(1500));
		flota.add(new Coche(1300));
		flota.add(new Bicicleta(12));

	}

}
