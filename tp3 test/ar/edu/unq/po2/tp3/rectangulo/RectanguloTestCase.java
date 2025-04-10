package ar.edu.unq.po2.tp3.rectangulo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
    private Rectangulo rectangulo;
    private Point posicionInicial;

    @BeforeEach
    void setUp() {
        posicionInicial = new Point(2, 3);
        rectangulo = new Rectangulo(posicionInicial, 5, 3);
    }

    @Test
    void testCreacion() {
        assertEquals(2, rectangulo.getPosicion().getX());
        assertEquals(3, rectangulo.getPosicion().getY());
        assertEquals(5, rectangulo.getAncho());
        assertEquals(3, rectangulo.getAlto());
    }

    @Test
    void testArea() {
        assertEquals(15, rectangulo.area());
    }

    @Test
    void testPerimetro() {
        assertEquals(16, rectangulo.perimetro());
    }

    @Test
    void testOrientacion() {
        assertTrue(rectangulo.esHorizontal());
        assertFalse(rectangulo.esVertical());
    }

    @Test
    void testMover() {
        rectangulo.moverA(0, 0);
        assertEquals(0, rectangulo.getPosicion().getX());
        assertEquals(0, rectangulo.getPosicion().getY());
    }
}