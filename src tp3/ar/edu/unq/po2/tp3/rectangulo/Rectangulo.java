package ar.edu.unq.po2.tp3.rectangulo;

public class Rectangulo {
	private Point posicion;
	private int base; // base
	private int altura; // altura

	public Point getPosicion() {
		return posicion;
	}

	public int getAncho() {
		return base;
	}

	public int getAlto() {
		return altura;
	}

	public void moverA(int nuevaX, int nuevaY) {
		this.posicion = new Point(nuevaX, nuevaY);
	}

	public Rectangulo(Point posicion, int base, int altura) {
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException("Las dimensiones deben ser positivas");
		}
		this.posicion = posicion;
		this.base = base;
		this.altura = altura;
	}

	public int area() {
		return base * altura;
	}

	public int perimetro() {
		return 2 * (base + altura);
	}

	public boolean esHorizontal() {
		return base > altura;
	}

	public boolean esVertical() {
		return altura > base;
	}

}