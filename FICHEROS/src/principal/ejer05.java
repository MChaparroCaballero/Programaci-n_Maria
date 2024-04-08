package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class ejer05 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		String ficheroEntrada = "C:\\EJERFICHEROS\\nombres.txt", ficheroSalida = "C:\\EJERFICHEROS\\nombresOrdenados.txt", linea;

		try (BufferedReader br = new BufferedReader(new FileReader(ficheroEntrada));) {
			linea = br.readLine();
			while (linea != null) {
				lista.add(linea);
				linea = br.readLine();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		/****************************************/
		Collections.sort(lista);
		/****************************************/
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(ficheroSalida));){
			for(String item:lista)bw.write(item+"\n");
		}catch(Exception e) {
			
		}
	}

}
