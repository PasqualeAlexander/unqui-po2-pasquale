package ar.edu.unq.po2.tp4.supermercado;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

    private Trabajador trabajador;

    @BeforeEach
    public void setUp() {
        ArrayList<Ingreso> ingresos = new ArrayList<>();

        // Ingreso común: 50.000
        ingresos.add(new Ingreso("Enero", "Sueldo mensual", 50000.0));
        
        // Ingreso común: 60.000
        ingresos.add(new Ingreso("Febrero", "Sueldo mensual", 60000.0));
        
        // Ingreso por horas extras: 8000 (debe sumar a percibido, pero no al imponible)
        ingresos.add(new IngresoPorHorasExtras("Marzo", "Horas extras", 8000.0, 10));

        trabajador = new Trabajador(ingresos); // el segundo parámetro se ignora según tu implementación
    }

    @Test
    public void testTotalPercibidoIncluyeHorasExtras() {
        // 50.000 + 60.000 + 8.000 = 118.000
        assertEquals(118000.0, trabajador.getTotalPercibido());
    }

    @Test
    public void testMontoImponibleExcluyeHorasExtras() {
        // Sólo los ingresos normales: 50.000 + 60.000 = 110.000
        assertEquals(110000.0, trabajador.getMontoImponible());
    }

    @Test
    public void testImpuestoAPagarEsEl2PorcientoDelMontoImponible() {
        // 2% de 110.000 = 2.200
        assertEquals(2200.0, trabajador.getImpuestoAPagar());
    }
}
