package nuestrocumplefuturo;

import java.time.LocalDate;

public class principal {

	public static void main(String[] args) {
		// obten tu dia de semana de nacmiento, y de la fecha actual obten en que dia de la semana caera en los proximos 10 años//

		LocalDate cumple;
		cumple = LocalDate.of(2004, 8, 22);
		
		System.out.println(cumple.getDayOfWeek());
		LocalDate today= LocalDate.now();
		
		LocalDate futuro= LocalDate.of(today.getYear(), cumple.getMonth(), cumple.getDayOfMonth());
		System.out.println(futuro.getDayOfWeek());
		for(int i=0; i<=10; i++) {
			futuro.plusYears(1);
			System.out.println(futuro.getDayOfWeek());
		}
	}

}
