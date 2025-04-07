package ar.edu.unq.po2.tp3.rectangulo;

public class Cuadrado extends Rectangulo {

    public Cuadrado(Point posicion, int lado) {
        super(posicion, lado, lado);
    }

    public int getLado() {
        return getAncho();
    }

    @Override
    public boolean esHorizontal() {
        return false; 
    }
    
    @Override
    public boolean esVertical() {
        return false; 
    }
}