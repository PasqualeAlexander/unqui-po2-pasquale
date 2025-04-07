package ar.edu.unq.po2.tp3.desarmandonumeros;

public class Multiplos {
	private int x;
	private int y;

	public Multiplos(int unNumero, int otroNumero) {
		this.x = unNumero;
		this.y = otroNumero;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	int multiplosMasAltoEntre(int unNumero, int otroNumero) {
		int multiplo = 1;
		int maximoComunMultiplo = -1;
		if (((unNumero * otroNumero * 1) >= 1000)) {
			return -1;
		} else if ((unNumero == 0) || (otroNumero == 0)) {
			return 0;
		}
		while ((unNumero * otroNumero * multiplo) < 1000) {
			maximoComunMultiplo = (unNumero * otroNumero * multiplo);
			multiplo++;
		}
		return maximoComunMultiplo;
	}
}
/*
 * Realice una función que reciba dos valores X e Y, y devuelva el número más
 * alto entre 0 y 1000, que sea múltiplo simultáneamente de X e Y. Si no existe,
 * devolver -1. Por ejemplo si se ingresa 3 y 9, la función debe devolver 999.
 */