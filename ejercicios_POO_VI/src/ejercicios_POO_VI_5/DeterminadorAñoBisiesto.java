package ejercicios_POO_VI_5;

public class DeterminadorAñoBisiesto {

	private int año;
	private final int divisor1;
	private final int divisor2;
	private final int divisor3;
	
	public DeterminadorAñoBisiesto(int año) {
		this.año= año;
		divisor1=4;
		divisor2=100;
		divisor3=400;
	}

	public int getAno() {
		return año;
	}

	public void setAno(int año) {
		this.año = año;
	}

	public int getDivisor1() {
		return divisor1;
	}

	public int getDivisor2() {
		return divisor2;
	}

	public int getDivisor3() {
		return divisor3;
	}

	
	
}
