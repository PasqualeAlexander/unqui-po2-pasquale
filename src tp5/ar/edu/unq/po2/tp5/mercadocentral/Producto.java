package ar.edu.unq.po2.tp5.mercadocentral;

public class Producto {
	protected double precio;
	protected int stock;
	protected String nombre;
	protected boolean esProductoDeCooperativa;

	public Producto(double precio, int unStock, String nombre) {
		this.precio = precio;
		this.stock = unStock;
		this.esProductoDeCooperativa = false;
		this.nombre = nombre;
	}

	public boolean getEsProductoDeCooperativa() {
		return this.esProductoDeCooperativa;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int unStock) {
		this.stock = unStock;
	}

	public void setPrecio(double unPrecio) {
		this.precio = unPrecio;
	}

	public void decrementarStock() {
		if (this.stock > 0) {
			this.stock -= 1;
		} else {
			throw new IllegalStateException("No hay stock disponible");
		}
	}
}
