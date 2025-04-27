package ar.edu.unq.po2.tp5.mercadocentral;

public class ProductoTradicional extends Producto {

	public ProductoTradicional(double precio, int unStock, String nombre) {
		super(precio, unStock, nombre);
		this.esProductoDeCooperativa = false;
	}

		public boolean getEsProductoDeCooperativa() {
			return this.esProductoDeCooperativa;
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
