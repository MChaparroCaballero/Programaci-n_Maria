package ejemplo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	/*6. Cambia las variables de debajo a private
	 * Vete a Uso_Coche*/
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public Coche() {
		ancho = 2500;
		largo = 4000;
		ruedas = 4;
		motor = 200;
		peso_plataforma = 1900;

	}

	public boolean dime_climatizador() {
		return climatizador;
	}

	public void configura_climatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}

	public String dime_motor() {// GETTER

		return "El motor del coche tiene " + motor + " caballos de potencia";

	}

	/*
	 * public void establece_color() 
	 * {// 1. Antes el Setter se me quedaba así 
	 * Pero ahora vamos a trabajar con el paso de parámetros. 
	 * Elimina la línea color =
	 * "Rojo"; o crea un nuevo setter }
	 */

	public void establece_color(String color_coche) {
		/*
		 * 2. Introdúcele parámetros a establece color. 
		 * En concreto, String color_coche
		 */
		color=color_coche;
		//4. Establecemos la igualdad entre 
		//el color de los atributos y el del setter
	
	}

	public String dime_color() { // GETTER
		return "El color de tu coche es " + color;
	}
	
	/*8. Crea este Getter.
	 * Posteriormente, vete a Uso_Coche*/
	public String dime_datos_generales() {
		return "La plataforma del coche tiene " + ruedas + " ruedas" +
				". Mide " + largo/1000 + " metros con un ancho de "
				+ ancho + " centímetros y un peso de plataforma de " 
				+ peso_plataforma + " kg";
	}
	/*10. Seguimos creando los Setters para el asiento de cuero
	 * El argumento asientos_cuero y la variable se llaman igual.
	 * ¿Cual escojo?¿Cómo distingo cuando hago referencia a uno u otro?
	 * THIS. hace referencia a la propia clase, es decir, a este argumento,
	 * no al de la variable*/
	public void configura_asientos(String asientos_cuero) {//SETTER
		if(asientos_cuero=="si") {
			//11. Eres pobre, en tu caso siempre será false
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
		
	}
	public String dime_asientos() {
		if (asientos_cuero) {
		/*12.Java sabe que me refiero a la variable de clase, 
		 * no hay otra variable en el método getter, dentro del ().
		 * No hace falta el this.
			*/
		return "El coche tiene asientos de cuero";
		/*13. No escribas el else aún. ¿Ves algún error?
		 * Eclipse es listo e identifica ese if. ¿Qué ocurre con ello?
		 * Hasta que no le des un else y un caso para cerciorarse 
		 * de que siempre va a pasar, no parará de quejase.
		 * Vete a Uso_Coche*/
		}else {
			return "Tus asientos son de pena.";
		}
		
	}

}



