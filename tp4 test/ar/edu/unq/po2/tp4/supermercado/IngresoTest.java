package ar.edu.unq.po2.tp4.supermercado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoTest {

    private Ingreso ingreso;

    @BeforeEach
    public void setUp() {
        ingreso = new Ingreso("Marzo", "Sueldo mensual", 50000.0);
    }

    @Test
    public void testIngresoTieneMesConceptoYMontoCorrectos() {
        assertEquals("Marzo", ingreso.getMesDePercepcion());
        assertEquals("Sueldo mensual", ingreso.getConcepto());
        assertEquals(50000.0, ingreso.getMontoPercibido());
        assertEquals(50000.0, ingreso.getMontoImponible());
    }

    @Test
    public void testSettersFuncionanCorrectamente() {
        ingreso.setMesDePercepcion("Abril");
        ingreso.setConcepto("Aguinaldo");
        ingreso.setMontoPercibido(30000.0);

        assertEquals("Abril", ingreso.getMesDePercepcion());
        assertEquals("Aguinaldo", ingreso.getConcepto());
        assertEquals(30000.0, ingreso.getMontoPercibido());
        assertEquals(30000.0, ingreso.getMontoImponible());
    }
}

