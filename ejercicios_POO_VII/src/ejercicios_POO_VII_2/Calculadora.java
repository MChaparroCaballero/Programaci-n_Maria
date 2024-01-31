package ejercicios_POO_VII_2;

public class Calculadora {

	private double operador1;
	private double operador2;
	private static double resultado;

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		resultado = 0;

	}

	public double getOperador1() {
		return operador1;
	}

	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}

	public double getOperador2() {
		return operador2;
	}

	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}

	public static double getResultado() {
		return resultado;
	}

	public static void setResultado(double resultado) {
		Calculadora.resultado = resultado;
	}

	public static double suma(double operado1, double operador2) {
		Calculadora.resultado = operado1 + operador2;
		return Calculadora.resultado;
	}

	public static double resta(double operado1, double operador2) {
		Calculadora.resultado = operado1 - operador2;
		return Calculadora.resultado;
	}

	public static double multiplicacion(double operado1, double operador2) {
		Calculadora.resultado = operado1 * operador2;
		return Calculadora.resultado;
	}

	public static double division(double operado1, double operador2) {
		Calculadora.resultado = operado1 / operador2;
		return Calculadora.resultado;
	}
}