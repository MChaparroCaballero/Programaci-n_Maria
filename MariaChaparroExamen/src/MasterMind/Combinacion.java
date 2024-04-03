
package MasterMind;

public class Combinacion {
	/*yo no he sabido como hacer el metodo alea para letras, asique lo he hecho de teclado para por lo menos que se pueda comprobar que 
	el metodo para valida las combinacines funciona*/

	String[] Combi = { "Z", "B", "R", "V" };
	String[] TablaColores = { "R", "A", "V", "Z", "M", "B" };
	final int NumColoresCombinacion = 4;
	final int NumColoresJuego = 6;
	/*Esto es un contador que suma cada vez que hayas acertado una posicion correcta de los colores*/
	static int contadorc;

	public Combinacion() {

	}

	//a) metodo para evaluar si el codigo que mete el suuario es igual al de la combinación secreta//
	public static void EvaluacionCombinacion(String[] Combi, String [] Resultado) {

		
		for (int i = 0; i <= Combi.length; i++) {
			if (Combi[i].equalsIgnoreCase(Resultado[i])) {
				System.out.println("posicion " + i + " HAS HACERTADO");
				contadorc=contadorc+1;
			} else {
				System.out.println("posicion " + i + " HAS FALLADO");
				
			}

		}

	}

	//setters y getters//
	public String[] getCombi() {
		return Combi;
	}

	public void setCombi(String[] combi) {
		Combi = combi;
	}

	public String[] getTablaColores() {
		return TablaColores;
	}

	public void setTablaColores(String[] tablaColores) {
		TablaColores = tablaColores;
	}

	public int getNumColoresCombinacion() {
		return NumColoresCombinacion;
	}

	public int getNumColoresJuego() {
		return NumColoresJuego;
	}

	public static int getContadorc() {
		return contadorc;
	}

	public static void setContadorc(int contadorc) {
		Combinacion.contadorc = contadorc;
	}

}
