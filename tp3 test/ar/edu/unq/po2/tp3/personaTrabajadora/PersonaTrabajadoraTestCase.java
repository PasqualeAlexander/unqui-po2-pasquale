package ar.edu.unq.po2.tp3.personaTrabajadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo;
	private PersonaTrabajadora persona1;
	private PersonaTrabajadora persona2;

	@BeforeEach
	void setUp() {
		equipo = new EquipoDeTrabajo("Equipo de Desarrollo");
		persona1 = new PersonaTrabajadora("Alexander", "Pasquale", 32);
		persona2 = new PersonaTrabajadora("Joaquin", "Escalante", 28);
	}

	@Test
	void testCreacionEquipo() {
		assertEquals("Equipo de Desarrollo", equipo.getNombreDelEquipo());
		assertTrue(equipo.getIntegrantes().isEmpty());
	}

	@Test
	void testAgregarIntegrante() {
		equipo.agregarIntegrante(persona1);

		assertEquals(1, equipo.getIntegrantes().size());
		assertEquals("Alexander", equipo.getIntegrantes().get(0).getNombre());
	}

	@Test
	void testPromedioEdadSinIntegrantes() {
		assertEquals(0.0, equipo.promedioEdadIntegrantes());
	}

	@Test
	void testPromedioEdadUnIntegrante() {
		equipo.agregarIntegrante(persona1);

		assertEquals(32.0, equipo.promedioEdadIntegrantes());
	}

	@Test
	void testPromedioEdadVariosIntegrantes() {
		equipo.agregarIntegrante(persona1); // 32 años
		equipo.agregarIntegrante(persona2); // 28 años
		equipo.agregarIntegrante(new PersonaTrabajadora("Franco", "Ruggiero", 36)); // 36 años

		double promedioEsperado = (32 + 28 + 36) / 3.0;
		assertEquals(promedioEsperado, equipo.promedioEdadIntegrantes());
	}

	@Test
	void testListaIntegrantesInmutable() {
		equipo.agregarIntegrante(persona1);
		List<PersonaTrabajadora> integrantes = equipo.getIntegrantes();
	}
}