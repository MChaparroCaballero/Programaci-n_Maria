package pOLIMORFISMOiNTERFACE;

public class Futbolista extends SeleccionFutbol{
private int dorsal;
private String demarcacion;

	//constructor heredado//
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
	super(id, nombre, apellidos, edad);
	this.dorsal = dorsal;
	this.demarcacion = demarcacion;
}

	//getters y setters//
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
	//hacemos un string buffer es simplemente un buffer que contiene un string el cual puedes eliminar cosas a lo arraylist//
	StringBuffer cadena= new StringBuffer("F dorsal= "+dorsal+"\n");
	cadena.append(" demarcacion=" + demarcacion+"\n");
	cadena.append(super.toString());
	return cadena.toString();
	}
	
	//sobreescribimos los metodos de seleccionfutbol, esto va a cambiar la adapatacion que hace futbolista de la interface//
	@Override
	public void concentrarse() {
		System.out.println("Concentrarse (Clase Futbolista)");

	}

	@Override
	public void viajar() {
		System.out.println("Viajar (Clase Futbolista)");

	}

	@Override
	public void entrenar() {
		System.out.println("Entrenarse (Clase Futbolista)");

	}

	@Override
	public void jugarPartido() {
		System.out.println("Asistir al partido (Clase Futbolista)");

	}

}
