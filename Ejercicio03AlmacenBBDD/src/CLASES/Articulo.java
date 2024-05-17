package CLASES;

public class Articulo {
private int ID;
private String DESCRIPCION;
private double PRECIO_DE_COMPRA;
private double PRECIO_DE_VENTA;
private int STOCK;
public Articulo(int iD, String dESCRIPCION, double pRECIO_DE_COMPRA, double pRECIO_DE_VENTA, int sTOCK) {
	super();
	ID = iD;
	DESCRIPCION = dESCRIPCION;
	PRECIO_DE_COMPRA = pRECIO_DE_COMPRA;
	PRECIO_DE_VENTA = pRECIO_DE_VENTA;
	STOCK = sTOCK;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getDESCRIPCION() {
	return DESCRIPCION;
}
public void setDESCRIPCION(String dESCRIPCION) {
	DESCRIPCION = dESCRIPCION;
}
public double getPRECIO_DE_COMPRA() {
	return PRECIO_DE_COMPRA;
}
public void setPRECIO_DE_COMPRA(double pRECIO_DE_COMPRA) {
	PRECIO_DE_COMPRA = pRECIO_DE_COMPRA;
}
public double getPRECIO_DE_VENTA() {
	return PRECIO_DE_VENTA;
}
public void setPRECIO_DE_VENTA(double pRECIO_DE_VENTA) {
	PRECIO_DE_VENTA = pRECIO_DE_VENTA;
}
public int getSTOCK() {
	return STOCK;
}
public void setSTOCK(int sTOCK) {
	STOCK = sTOCK;
}



}
