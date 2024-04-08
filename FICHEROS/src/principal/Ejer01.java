package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejer01 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		String fichero = "nombres.txt",linea;
		BufferedReader br= null;
	
		try {
		 br= new BufferedReader(new FileReader(fichero));
		 linea=br.readLine();
		 while(linea!=null) {
			 System.out.println(linea);
			 linea=br.readLine();
		 }
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}finally {
			br.close();
		}
	}

}
