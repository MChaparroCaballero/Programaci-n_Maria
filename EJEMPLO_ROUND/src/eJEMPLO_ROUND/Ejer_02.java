package eJEMPLO_ROUND;

import java.util.ArrayList;

public class Ejer_02 {

	public static void main(String[] args) {//sdwsf//
		int tb[]= {1,2,3,4,5};
		ArrayList<String> lista = new ArrayList <String> ();
		
		lista.add(1,"Maria");
		lista.add("Mar");
		
		for(String ele : lista) {
			System.out.println(ele);
		}
		
		for(int n : tb) {
			System.out.println(n);
		}
		
		for(int i=0;i<tb.length;i++) {
			System.out.println(tb[i]);
		}
	}

}
