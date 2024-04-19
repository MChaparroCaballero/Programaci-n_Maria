package Clases;

public class Carta {
private String Palo;
private String numero;

public Carta(String palo, String numero) {
	super();
	Palo = palo;
	this.numero = numero;
}

public String getPalo() {
	return Palo;
}

public void setPalo(String palo) {
	Palo = palo;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

@Override
public String toString() {
	return "(" + Palo + "," +  numero + ")";
}



}
