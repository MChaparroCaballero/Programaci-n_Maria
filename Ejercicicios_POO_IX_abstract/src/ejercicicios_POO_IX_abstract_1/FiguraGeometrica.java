package ejercicicios_POO_IX_abstract_1;

public abstract class FiguraGeometrica {
protected double x;
protected double y;

protected FiguraGeometrica(double x, double y) {
	this.x = x;
	this.y = y;
}
	public abstract double calcularArea();
}
