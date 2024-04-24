package ejer02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terminal t1 = new Terminal("678 11 22 33");
		Terminal t2 = new Terminal("644 74 44 69");
		Terminal t3 = new Terminal("622 32 89 09");
		Terminal t4 = new Terminal("664 73 98 18");

		// imprimimos las terminales recien creadas//
		System.out.println(t1);
		System.out.println(t2);

		// la primera terminal llama a la segunda y tercera, mientras que t1 acumula
		// 320+200 t2 acumula 320 y t3 200//
		t1.llama(t2, 320);
		t1.llama(t3, 200);

		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}

}
