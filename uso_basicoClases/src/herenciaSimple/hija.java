package herenciaSimple;

public class hija extends madre {
private String apellido2;

public hija(String persona, String apellido, String apellido2) {
	super(persona, apellido);
	this.apellido2 = apellido2;
}

public String getApellido2() {
	return apellido2;
}

public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}

@Override
public void info() {
	// TODO Auto-generated method stub
	System.out.println("nombre " + getPersona() + " apellido1 " +getApellido() + " apellido2 " + apellido2);
}


}
