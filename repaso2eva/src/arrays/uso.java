package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class uso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] numero = new int[3];

		for (int i = 0; i < 3; i++) {
			numero[i] = sc.nextInt();
		}
		
		for(int azar: numero) {
			System.out.println(azar);
		}
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(22);
		for(Integer f: lista) {
			System.out.println(f);
		}
	

	}
}
