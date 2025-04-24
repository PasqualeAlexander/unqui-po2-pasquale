package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FacturaTest {

	@Test
	@DisplayName("Servicio: getCosto = costoPorUnidad * unidades")
	void servicioCalculaMontoCorrectamente() {
		String id = "SVC-001";
		double costoPorUnidad = 25.0;
		int unidades = 4;
		Servicio servicio = new Servicio(id, costoPorUnidad, unidades);

		double monto = servicio.getCosto();

		assertEquals(id, servicio.getId(), "El ID debe mantenerse igual");
		assertEquals(25.0 * 4, monto, 1e-9, "Monto de Servicio mal calculado");
	}

	@Test
	@DisplayName("Impuesto: getCosto = tasaFija")
	void impuestoCalculaMontoCorrectamente() {
		String id = "IMP-123";
		double tasaFija = 150.50;
		Impuesto impuesto = new Impuesto(id, tasaFija);

		double monto = impuesto.getCosto();

		assertEquals(id, impuesto.getId(), "El ID debe mantenerse igual");
		assertEquals(tasaFija, monto, 1e-9, "Monto de Impuesto mal calculado");
	}

	@Test
	@DisplayName("Servicio: unidades cero -> monto cero")
	void servicioConCeroUnidadesDaCero() {
		Servicio servicio = new Servicio("SVC-000", 100.0, 0);
		assertEquals(0.0, servicio.getCosto(), 1e-9);
	}

	@Test
	@DisplayName("Impuesto: tasa fija cero -> monto cero")
	void impuestoConTasaCeroDaCero() {
		Impuesto impuesto = new Impuesto("IMP-000", 0.0);
		assertEquals(0.0, impuesto.getCosto(), 1e-9);
	}
}
