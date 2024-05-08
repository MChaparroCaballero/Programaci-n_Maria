package ejer05;

public class Principal {

	// utilizamos el metodo alea para que asi nos saque los numeros entre 0 y 6
	// cuando lo llamemos//
	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// simplemente hacemos un array de objetos, pero el truco es que la ficha en la
		// primera posicion (0) le ponemos su valor fuera del bucle y el resto su primer
		// lado sera igual al segundo lado de la ficha creada anterior a si misma asi
		// todas tienen que coincidir por fuerza pero el segundo lado si sera al azar//
		
		FichaDomino[] Fichas = new FichaDomino[8];
		Fichas[0] = new FichaDomino(alea(0, 6), alea(0, 6));

		for (int i = 1; i < Fichas.length; i++) {
			Fichas[i] = new FichaDomino(Fichas[i - 1].getLado2(), alea(0, 6));
		}

		
		for (int i = 0; i < Fichas.length; i++) {
			System.out.print(Fichas[i]);

		}

	}

}
