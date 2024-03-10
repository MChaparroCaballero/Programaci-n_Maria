package repaso2eva_2;

public class Mamifero extends Animal {
	private int patas;
	private boolean huevos;

	public Mamifero() {
		super();
		this.patas = 4;
		this.huevos = false;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isHuevos() {
		return huevos;
	}

	public void setHuevos(boolean huevos) {
		this.huevos = huevos;
	}

	@Override
	public void info() {
		System.out.print("%5d= " + huevos + patas);

	}

}
