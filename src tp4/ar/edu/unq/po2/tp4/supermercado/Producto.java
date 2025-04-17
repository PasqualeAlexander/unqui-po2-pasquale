package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	protected String nombre;
	protected double precio;
	protected boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio = (this.precio + aumento);
	}
}