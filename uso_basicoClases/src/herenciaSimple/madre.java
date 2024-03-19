package herenciaSimple;

public class madre {
private String persona;
private String apellido;
public madre(String persona, String apellido) {
	super();
	this.persona = persona;
	this.apellido = apellido;
}
public String getPersona() {
	return persona;
}
public void setPersona(String persona) {
	this.persona = persona;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}

public void info() {
	System.out.print("nombre:" + persona + "apellido:" + apellido );
}
}
