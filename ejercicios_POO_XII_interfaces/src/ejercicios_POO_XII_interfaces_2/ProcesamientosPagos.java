package ejercicios_POO_XII_interfaces_2;

public class ProcesamientosPagos {

	interface ProcesadorPago {
		
		
		public static double dinero = 0;

		public void realizarPago();

		public void reembolsarPago();
	}
}
