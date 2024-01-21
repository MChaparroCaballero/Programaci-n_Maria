package ejercicios_POO_III_2;

public class Uso_deHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel(); //instanciar la clase
		
		//carga los valores de las variables
		Habitacion habitacion1 = new Habitacion(5, "simple");
		Habitacion habitacion2 = new Habitacion(6, "doble");
		Habitacion habitacion3 = new Habitacion(7, "suite");
		
		// añadir habitaciones al hotel
		hotel.habitaciones.add(habitacion1);
		hotel.habitaciones.add(habitacion2);
		hotel.habitaciones.add(habitacion3);
		// reservar una habitación
		hotel.reservarHabitacion(6);
		
	}

}
