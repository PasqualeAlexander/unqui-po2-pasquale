package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double porcentajeDeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.precio = this.getPrecio() * porcentajeDeDescuento;
	}
}
