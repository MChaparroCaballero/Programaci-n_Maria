package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fichero = "C:\\EJERFICHEROS\\LUNES.TXT";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));) {
			for (int i = 0; i <= 500; i++) {
				bw.write(String.valueOf(i) + "\n");
			}

		} catch (Exception e) {

		}
	}

}
