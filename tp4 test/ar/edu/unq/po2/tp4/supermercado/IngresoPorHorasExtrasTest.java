package ar.edu.unq.po2.tp4.supermercado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPorHorasExtrasTest {

    private IngresoPorHorasExtras ingresoHorasExtras;

    @BeforeEach
    public void setUp() {
        ingresoHorasExtras = new IngresoPorHorasExtras("Abril", "Horas extras", 8000.0, 10);
    }

    @Test
    public void testIngresoPorHorasExtrasDevuelveCeroComoMontoImponible() {
        assertEquals("Abril", ingresoHorasExtras.getMesDePercepcion());
        assertEquals("Horas extras", ingresoHorasExtras.getConcepto());
        assertEquals(8000.0, ingresoHorasExtras.getMontoPercibido());
        assertEquals(0.0, ingresoHorasExtras.getMontoImponible());
        assertEquals(10, ingresoHorasExtras.getCantidadHoras());
    }

    @Test
    public void testSetCantidadHoras() {
        ingresoHorasExtras.setCantidadHoras(15);
        assertEquals(15, ingresoHorasExtras.getCantidadHoras());
    }
}
