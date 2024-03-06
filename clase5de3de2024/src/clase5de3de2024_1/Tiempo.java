package clase5de3de2024_1;

public class Tiempo {
	private int segundos;

	public Tiempo(int h, int m, int s) {
		super();
		//PASAMOS TODO A SEGUNDOS//
		this.segundos = (h*3600) + (m*60) + s;
	}

	public Tiempo(int s) {//CONSTRCUTOR PARA LOS METODOS DE SUMA Y RESTA QUE NOS CREAN UN NUEVOOBJETO//
		super();
		this.segundos = s;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public Tiempo suma(Tiempo t) {//sumammos los segundos//
		return new Tiempo(this.segundos+t.getSegundos());
	}
	public Tiempo resta(Tiempo t) {//restamos los segundos con un objeto nuevo//
		return new Tiempo(this.segundos-t.getSegundos());
		

			}

	@Override
	public String toString() {
		//aqui es cuanod hacemos os arrgles d eimpresion aka://
		//las horas se pasan a enteras y seran los segundos entre 3600//
		int h=(int) (this.segundos/3600);
		//los segundos seras igual a el resto entre los segundos partido por 3600//
		int s=this.segundos%3600;
		//los minutos se pasa a enteros y seran igual a los segundos [lo que queda despues de hacer las horas] partido por 60//
		int m= (int)(s/60);
		//ahora los segundos seras igual a el resto que quedo de los segundos entre 60 aka el resto despues de hacer los minutos//
		s=s%60;
		//devolvemos un string//
		return String.format("Horas=%d Minutos=%d segundos=%d",h,m,s);
	}
		

	

}
