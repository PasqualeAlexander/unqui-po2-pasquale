package ar.edu.unq.po2.tp5.mercadocentral;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(double precio, int unStock, String nombre) {
		super (precio, unStock, nombre);
		this.esProductoDeCooperativa = true;
	}

	double porcentajeDeDescuentoPorIVA(){
		return 0.10;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * porcentajeDeDescuentoPorIVA());
	}
}
