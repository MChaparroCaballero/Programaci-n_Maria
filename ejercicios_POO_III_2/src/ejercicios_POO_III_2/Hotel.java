package ejercicios_POO_III_2;

import java.util.ArrayList;

public class Hotel {
	
		ArrayList<Habitacion> habitaciones;// crea una lista de habitaciones
		// constructor
		public Hotel() {
			this.habitaciones = new ArrayList<>();
		}
		// método para reservar las habitaciones
		public void reservarHabitacion(int numero) {
			if (verificarDisponibilidad(numero)) {
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
		public void cancelarReserva(int numero) {
			if (!verificarDisponibilidad(numero)) {
				for (Habitacion a : habitaciones) {
					if (a.get_numerohabitacion() == numero) {
						a.setOcupada(false);
						System.out.println("Reserva cancelada");
						break;
					}
				}
			} else {
				System.out.println("La habitación no está reservada");
			}
		}
		//método para verificar la disponibilidad//
		public boolean verificarDisponibilidad(int numero) {
			for (Habitacion a : habitaciones) {
				if (a.get_numerohabitacion() == numero) {
					return !a.esOcupada();
				}
			}
			System.out.println("No existe la habitación");
			return false;
		}
	}
    

