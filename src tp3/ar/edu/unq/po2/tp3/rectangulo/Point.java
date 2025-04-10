package ar.edu.unq.po2.tp3.rectangulo;

public class Point {
	int x;
	int y;

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

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
        this(0, 0); // Llama al constructor principal pero asigna (0,0)
    }
	
	public Point moverUnPuntoAOtraPosicion(Point unPunto, int nuevaX, int nuevaY) {
		unPunto.setX(nuevaX);
		unPunto.setY(nuevaY);
		return unPunto;
	}
	
	public Point sumarPuntos(Point unPunto, Point otroPunto) {
	    int nuevaX = unPunto.getX() + otroPunto.getX();
	    int nuevaY = unPunto.getY() + otroPunto.getY();
	    return new Point(nuevaX, nuevaY);
	}
}

/*
 * Diseñe e implemente la clase Point (punto). La misma debe tener el siguiente
 * comportamiento: 1. Debe ser posible crearse indicando como referencia los
 * valores x e y 2. También debe ser posible crear un punto directamente sin
 * enviarles parámetros, en este caso el punto debe crearse en las coordenadas
 * (0,0). 3. Debe ser posible mover un punto a otra posición. 4. Sumarse con
 * otro punto y como resultado obtener un nuevo punto con las valores de x e y
 * sumados.
 */