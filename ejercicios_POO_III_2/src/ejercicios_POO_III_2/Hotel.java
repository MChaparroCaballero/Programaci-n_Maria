package ejercicios_POO_III_2;

import java.util.ArrayList;

public class Hotel {
	
	
	/*Habitacion habitaciones = new Habitacion[numHabitaciones];
    for (int i = 0; i < numHabitaciones; i++) {
        habitaciones[i] = new Habitacion(i + 1, "simple");*/
		ArrayList<Habitacion> habitaciones;// crea una lista de habitaciones
		// constructor
		public Hotel() {
			this.habitaciones = new ArrayList<>();
		}
		// método para reservar las habitaciones
		public void reservar_Habitacion(int numero) {
			if (verificar_Disponibilidad(numero)) {
				for (Habitacion nueva : habitaciones) {
					if (nueva.get_numerohabitacion() == numero) {
						nueva.setOcupada(true);
						System.out.println("Reserva hecha con éxito");
						break;
					}
				}
			} else {
				System.out.println("No se puede hacer la reserva");
			}
		}
		//método para cancelar la reserva
		public void cancelar_Reserva(int numero) {
			if (!verificar_Disponibilidad(numero)) {
				for (Habitacion h : habitaciones) {
					if (h.get_numerohabitacion() == numero) {
						h.setOcupada(false);
						System.out.println("Reserva cancelada");
						break;
					}
				}
			} else {
				System.out.println("La habitación no está reservada");
			}
		}
		//método para verificar la disponibilidad
		public boolean verificar_Disponibilidad(int numero) {
			for (Habitacion h : habitaciones) {
				if (h.get_numerohabitacion() == numero) {
					return !h.esOcupada();
				}
			}
			System.out.println("No existe la habitación");
			return false;
		}
	}
    

