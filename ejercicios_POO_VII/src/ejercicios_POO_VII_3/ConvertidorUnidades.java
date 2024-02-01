package ejercicios_POO_VII_3;

public class ConvertidorUnidades {
	private double temp1;
	private static double tempfinal;

	ConvertidorUnidades(double temp1) {
		this.temp1 = temp1;
		tempfinal = 0;

	}

	public double getTemp1() {
		return temp1;
	}

	public void setTemp1(double temp1) {
		this.temp1 = temp1;
	}

	public static double getTempfinal() {
		return tempfinal;
	}

	public static void setTempfinal(double tempfinal) {
		ConvertidorUnidades.tempfinal = tempfinal;
	}

	public static double KilometrosMilla(double temp1) {
		ConvertidorUnidades.tempfinal = temp1 / 1.609;
		return ConvertidorUnidades.tempfinal;

	}

	public static double MillasKilometros(double temp1) {
		ConvertidorUnidades.tempfinal = temp1 * 1.609;
		return ConvertidorUnidades.tempfinal;

	}

	public static double CelsiusFarenheit(double temp1) {
		ConvertidorUnidades.tempfinal = (temp1 * 1.8) + 32;
		return ConvertidorUnidades.tempfinal;

	}

	public static double FarenheitCelsius(double temp1) {
		ConvertidorUnidades.tempfinal = (temp1 - 32) * 0.555;
		return ConvertidorUnidades.tempfinal;

	}

}
