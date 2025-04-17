package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	 private double porcentajeDeDescuento;
	 
	public ProductoPrimeraNecesidad(String nombre, double precio, double porcentajeDeDescuento) {
		super(nombre, precio);
		this.esPrecioCuidado = true;
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}
	
	@Override
	public double getPrecio() {
		return (super.precio * this.porcentajeDeDescuento); // El porcentaje se debe pasar como 0.10 (si es 10% por ejemplo)
	}
	
}
