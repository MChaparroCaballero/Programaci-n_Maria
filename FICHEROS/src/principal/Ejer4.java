package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer4 {

	public static void main(String[] args) {
		ArrayList<String> lista= new ArrayList<String>();
		lista.add("Ana");
		lista.add("Juan");
		lista.add("Ivan");
		lista.add("Lucas");
		
		Collections.sort(lista);
		
		for(String item:lista)System.out.println(item);

	}

}
