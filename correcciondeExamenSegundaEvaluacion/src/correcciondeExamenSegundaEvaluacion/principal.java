package correcciondeExamenSegundaEvaluacion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class principal {

	static Scanner sc = new Scanner(System.in);
	static final String[] tabladecolores = { "R", "A", "V", "Z", "M", "B" };
	static final int NumColoresCombinacion = 5;
	static final int NumColoresJuego = tabladecolores.length;

	private static String[] combi = new String[NumColoresCombinacion];
	private static String[] combiUsuario = new String[NumColoresCombinacion];

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	/****************************************************************************************************************/
	public static void rellenarConRepeticion() {
		for (int i = 0; i < combi.length; i++) {
			combi[i] = tabladecolores[alea(0, NumColoresJuego - 1)];
		}
	}
	/***********************************************************************************************************************/
	public static void rellenarSinRepeticion() {
		int tb [] = new int[NumColoresJuego],n;
		boolean colocada=false;
		for (int i = 0; i < combi.length; i++) {
			colocada=false;
			while (!colocada) {
				//generas en n la posicion de los colores de la tabla de colores con alea//
				n=alea(0,NumColoresJuego-1);
				if (tb[n]==0) {//si la posicion es 0 n que es la posicion inicial te rellena combi con el color de la tabla de colores en posicion n//
					combi[i]=tabladecolores[n];
					//tb ahora es 1 para que ya no sea 0 para no repetir//
					tb[n]=1;
					//colocada se hace true ya se para el bucle//
					colocada=true;
				}
			}
		}
	}
	/***********************************************************************************************************************/
	public static void RellenarUsuario(int intento) {
		System.out.println("Nº de intento " + intento);
		for(int i=0;i<combiUsuario.length;i++) {
			System.out.print("\t"+i+" ");
			combiUsuario[i]= sc.nextLine();
			
		}
	}
	/***********************************************************************************************************************/
	public static void comprobar(int resul []) {
		resul[0]=resul[1]=0;/*un string con esto de una que el valor en posicion 0y 1 sea 0*/
		String [] combi2 = Arrays.copyOf(combi,combi.length);/*compiamos lo del array*/
		String [] combiUsuario2 = Arrays.copyOf(combiUsuario,combiUsuario.length);
		
		for(int i=0; i<combi2.length;i++) {/*recorremos la copia de la combinacion*/
			if(combi2[i].equals(combiUsuario2[i])){/*si el valor de la posicion de la combi en i es igual al de la del usuario va sumando el vlor de resul en posicion 0 aka 0+1+1+1etc*/
				resul[0]++;
				combi2[i]=combiUsuario2[i]="-";/*cambiamos el valor a un guion para indicar undido en los dos*/
			}
		}
		
		/*--------------------------------------------------------------------------------------------------*/
		/*comprobamos si la misma letra esta en varias posiciones*/
		for(int i=0; i<combi2.length;i++) {
			if(combiUsuario2[i].equals("-"))continue;
			for(int j=0; j<combi2.length;j++) {
				if(combi2[j].equals(combiUsuario2[i])) {
					resul [1]++;
					combi2[j]="-";
					
				}
			}
			combiUsuario2[i]="-";
		}
	}
	/***********************************************************************************************************************/
	public static void imprimir(String [] ma) {
		for(int i=0; i<ma.length;i++)System.out.print(ma [i]);
		System.out.println();
	}
	/*************************************************************************************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intentos=0,numerointentos=5;
		int resultados [] = new int [2];
		rellenarSinRepeticion();
		imprimir(combi);
		do {
			RellenarUsuario(++intentos);
			comprobar(resultados);
			System.out.printf("Nº de aciertos=% Nº de aproximaciones=%d\n", resultados[0],resultados[1]);
		}while(intentos<numerointentos && resultados[0]!=NumColoresCombinacion);
		if(resultados[0]==NumColoresCombinacion) {
			System.out.println("Enhorabuena a acertado en el intento " + intentos);
			
		}else {
			System.out.println("Demasiado intentos.");
		}
	}

}
