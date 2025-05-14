package ar.edu.unq.po2.tp6.SOLID;

public class Propiedad {
	private String descripcionDeLaPropiedad;
	private double valorFiscal;
	private String direccion;

	public Propiedad(String descripcion, double valor, String direccion) {
		this.descripcionDeLaPropiedad = descripcion;
		this.valorFiscal = valor;
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return this.descripcionDeLaPropiedad;
	}

	public String direccion() {
		return this.direccion;
	}

	public double getValorFiscal() {
		return this.valorFiscal;
	}

	public void setValor(double nuevoValor) {
		this.valorFiscal = nuevoValor;
	}
	
	public void setDireccion(String nuevaDireccion) {
		this.direccion = nuevaDireccion;
	}
	
	public void setDescripcion(String nuevaDescripcion) {
		this.descripcionDeLaPropiedad = nuevaDescripcion;
	}
}
