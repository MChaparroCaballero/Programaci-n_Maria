package RAYOEXPLICACIONES;

import java.util.ArrayList;
import java.util.HashMap;

public class ExplHasMap2 {

	//En el parentesis lo que hacemos es meter el hashmap que sirve para luego poder imprimirlo despues.La K es el nombre que queramos poner
		public static void imprimir(HashMap<String, ArrayList<String>> K) {
			//Se pone el key set para poder obetener los valores
			for (String key : K.keySet()) {
				System.out.println(key);
				//Para obtener el arraylist
				for(String valor:K.get(key)) {
					System.out.println("\t"+valor);
				//Obtenemos el nombre de los hijos
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<String, ArrayList<String>> familias= new HashMap();
		
		familias.put("Perez", new ArrayList<String>()); //Creamos la familia Perez y un arraylist perteniciente a la misma
		
		//Aqui abajamos estamos añadiendo a  los miembros de la familia Perez en nuestro ArrayList y a la vez en nuestro HashMap
		
		familias.get("Perez").add("Juan Andrés");
		familias.get("Perez").add("Juan");
		familias.get("Perez").add("Andrés");
		familias.get("Perez").add("Pedro");
		
		
		//Para añadir otra familia a nuestro HashMap
		familias.put("Rey", new ArrayList<String>());
		familias.get("Rey").add("Juan Maria");
		familias.get("Rey").add("Maria");
		familias.get("Rey").add("Sancho");
		
		imprimir(familias);

	}

}
