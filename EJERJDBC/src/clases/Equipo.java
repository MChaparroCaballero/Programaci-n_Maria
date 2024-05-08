package clases;

public class Equipo {
private int Id;
private String Nombre;
private int Ptos;
private int PG;
private int PE;
private int PP;
private int GF;
private int GE;
public Equipo(int id, String nombre) {
	super();
	Id = id;
	Nombre = nombre;
	Ptos = 0;
	PG = 0;
	PE = 0;
	PP = 0;
	GF = 0;
	GE = 0;
}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getPtos() {
	return Ptos;
}
public void setPtos(int ptos) {
	Ptos = ptos;
}
public int getPG() {
	return PG;
}
public void setPG(int pG) {
	PG = pG;
}
public int getPE() {
	return PE;
}
public void setPE(int pE) {
	PE = pE;
}
public int getPP() {
	return PP;
}
public void setPP(int pP) {
	PP = pP;
}
public int getGF() {
	return GF;
}
public void setGF(int gF) {
	GF = gF;
}
public int getGE() {
	return GE;
}
public void setGE(int gE) {
	GE = gE;
}
@Override
public String toString() {
	return "Id=" + Id + ", Nombre=" + Nombre + ", Ptos=" + Ptos + ", PG=" + PG + ", PE=" + PE + ", PP=" + PP
			+ ", GF=" + GF + ", GE=" + GE + "]";
}



}
