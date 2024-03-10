package repaso2eva_2;

public class Perro extends Mamifero {
private String raza;

public Perro(String raza) {
	super();
	this.raza = raza;
}

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;
}

@Override
public void info() {
	// TODO Auto-generated method stub
	System.out.print(raza);
}

}
