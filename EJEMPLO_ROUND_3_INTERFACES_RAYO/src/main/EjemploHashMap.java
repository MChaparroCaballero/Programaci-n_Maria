package main;

import java.util.HashMap;
import java.util.Map.Entry;

public class EjemploHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> lista = new HashMap<String,Integer>();

		lista.put("peras", 10);
		lista.put("manzanas", 20);
		lista.put("Melocotones", 12);
		lista.put("kiwis", 100);
		lista.remove("Peras");
		lista.remove("Uvas");
 
		if (lista.containsKey("Manzanas")) {
			System.out.println("Existen las manzanas");
		} else {
			System.out.println("No existen las manzanas");
		}
		for(String key : lista.keySet()) 
			System.out.println(key+" "+lista.get(key));
		
		for(Integer valor : lista.values()) 
			System.out.println(valor);
		
		for(Entry<String, Integer> elemento : lista.entrySet()) 
			System.out.println(elemento.getKey()+ " "+elemento.getValue());
	
		
		System.out.println("N de numeros de lista" +lista.size());
}

}
