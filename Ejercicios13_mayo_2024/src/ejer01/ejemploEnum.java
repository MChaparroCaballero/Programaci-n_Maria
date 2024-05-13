package ejer01;

public class ejemploEnum {
	static enum Colores{BLANCO,NEGRO,ROJO,AZUL,GRIS};
	static enum ConsumoEnergetico{A,B,C,D,E,F};
	
	public static int isValidColor(String color) {
		for(Colores b:Colores.values())
			if(b.toString().compareToIgnoreCase(color)==0)return b.ordinal();
		return -1;
	
	}
	public static int isValidCE(char l) {
		
		String letra = Character.toString(l);
		for(ConsumoEnergetico e:ConsumoEnergetico.values())
			if(e.toString().compareToIgnoreCase(letra)==0)return e.ordinal();
		return -1;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(isValidColor("negro")!=-1) {
			System.out.println("color valido");
		}else {
			System.out.println("color invalido");
		}
	
		if(isValidCE('p')!=-1) {
			System.out.println("consumo valido");
		}else {
			System.out.println("consumo invalido");
		}
		/*Colores a = Colores.AZUL;
		for(Colores b: Colores.values()) {
			System.out.println(b.toString()+" "+b.ordinal());
		}*/ }
}
