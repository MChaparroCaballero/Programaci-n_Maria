package clases;

import java.time.LocalDate;

public class Alumno {
	private int ID;
	private String NOMBRE;
	private LocalDate FECHA_NAC;
	public Alumno(String nombre, LocalDate fecha) {
		super();
		this.ID = 888;
		this.NOMBRE= nombre;
		this.FECHA_NAC = fecha;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public LocalDate getFECHA_NAC() {
		return FECHA_NAC;
	}
	public void setFECHA_NAC(LocalDate fECHA_NAC) {
		FECHA_NAC = fECHA_NAC;
	}
	@Override
	public String toString() {
		return "Alumno [ID=" + ID + ", NOMBRE=" + NOMBRE + ", FECHA_NAC=" + FECHA_NAC + "]";
	}
	
	
	
	
}
