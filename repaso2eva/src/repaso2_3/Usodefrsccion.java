package repaso2_3;

public class Usodefrsccion {

	public static void main(String[] args) {
		/*
		 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y
		 * algunos de los métodos pueden ser invierte, simplifica, multiplica, divide,
		 * etc.
		 */

		Fraccion f1 = new Fraccion(-6, 2);
		Fraccion f2 = new Fraccion(3, 4);
		Fraccion f3 = new Fraccion(-1, 3);

		System.out.println(f1.multiplicar(f2).multiplicar(f3).simplificar());
	}

}
