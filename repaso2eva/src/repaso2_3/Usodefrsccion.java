package repaso2_3;

public class Usodefrsccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraccion f1= new Fraccion(-6,2);
		Fraccion f2= new Fraccion(3,4);
		Fraccion f3= new Fraccion(-1,3);
		
		
		System.out.println(f1.multiplicar(f2).multiplicar(f3).simplificar());
	}

}
