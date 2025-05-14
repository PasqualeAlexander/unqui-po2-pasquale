package ar.edu.unq.po2.tp6.SOLID;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private PerfilFinanciero perfilFinanciero;
	private List<Propiedad> propiedades = new ArrayList<>();

	public Cliente(String nombre, String apellido, String direccion, int edad, PerfilFinanciero perfilFinanciero,
			List<Propiedad> propiedades) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.perfilFinanciero = perfilFinanciero;
		this.propiedades = propiedades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public PerfilFinanciero getPerfilFinanciero() {
		return perfilFinanciero;
	}

	public void setPerfilFinanciero(PerfilFinanciero perfilFinanciero) {
		this.perfilFinanciero = perfilFinanciero;
	}

	public double getSueldoNetoAnual() {
		return this.perfilFinanciero.calcularSueldoNetoAnual();
	}

	public void setPropiedades(List<Propiedad> nuevaListaDePropiedades) {
		this.propiedades = nuevaListaDePropiedades;
	}

	public List<Propiedad> getPropiedades() {
		return this.propiedades;
	}

	public Propiedad obtenerPropiedadMasValiosa() {
		if (propiedades.isEmpty()) {
			throw new IllegalStateException("El cliente no posee propiedades.");
		}
		Propiedad propiedadMasValiosa = propiedades.get(0); // No se puede usar [0] porque solo es para los array y no
															// para los ArrayList.
		for (Propiedad propiedad : propiedades) {
			if (propiedad.getValorFiscal() > propiedadMasValiosa.getValorFiscal()) {
				propiedadMasValiosa = propiedad;
			}
		}
		return propiedadMasValiosa;
	}
}
