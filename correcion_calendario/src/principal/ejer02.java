package principal;

public class ejer02 {
	public static String centrar(String cadena ,int longitud, String caracter, String posicion) {
	int n;
	String resultado=null;
		switch(posicion.toUpperCase()) {
		case "D":
			//que lo quieres centrar a la derecha, pues me rellenas con el caracter tantas veces como la logntiud que debia ser menos lo que ocupa el mensaje en verdad y luego me rellenas con la cadena aka mensaje//
			resultado=caracter.repeat(longitud-cadena.length())+cadena;
			break;
		case "I":
			//que lo quieres centrar a la izquierda, pues me metes el mensaje y luego rellenas con el caracter tantas veces como la logntiud que debia ser menos lo que ocupa el mensaje en verdad//
			resultado=cadena+ caracter.repeat(longitud-cadena.length());
			break;
			
		default://en caso de en medio//
			n=(longitud-cadena.length())/2;//la longtidu es el largo del mensaje que deberia ser, le restamos lo que ocupa el propio mensaje y lo dividimos entre 2 para resolver los espacios a rellenar a ambos lados
			resultado= caracter.repeat(n)+cadena+caracter.repeat(longitud-cadena.length()-n);
		//resultado es la cadena que devolveremos en este caso le decimos que repita el caracter con el valor calculado de antes, luego me añades la cadena y luego el resto con caracteres que para eso hacemos lo de menos n del primero para que te de los que faltan
		}
		
		return resultado;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje="hola";
		System.out.println(centrar("hola",11,"*","C"));
		System.out.println(centrar("hola",11,"*","I"));
		System.out.println(centrar("hola",11,"*","D"));
	}

}
