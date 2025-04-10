package ar.edu.unq.po2.tp3.rectangulo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTest {
    private Cuadrado cuadrado;
    private Point posicionInicial;

    @BeforeEach
    void setUp() {
        posicionInicial = new Point(1, 1);
        cuadrado = new Cuadrado(posicionInicial, 4);
    }

    @Test
    void testCreacion() {
        assertEquals(1, cuadrado.getPosicion().getX());
        assertEquals(1, cuadrado.getPosicion().getY());
        assertEquals(4, cuadrado.getLado());
    }

    @Test
    void testArea() {
        assertEquals(16, cuadrado.area());
    }

    @Test
    void testOrientacion() {
        assertFalse(cuadrado.esHorizontal());
        assertFalse(cuadrado.esVertical());
    }
}