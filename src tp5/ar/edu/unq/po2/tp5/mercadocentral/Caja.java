package ar.edu.unq.po2.tp5.mercadocentral;

import java.util.List;
import java.util.ArrayList;

public class Caja implements AgenciaInterfaz {
	private List<Producto> productosRegistrados;
	private double montoTotalAPagar;

	public Caja() {
		this.productosRegistrados = new ArrayList<>();
		this.montoTotalAPagar = 0;
	}

	public void setProductosRegistrados(List<Producto> productosRegistrados) {
		this.productosRegistrados = productosRegistrados;
	}

	public List<Producto> getProductosRegistrados() {
		return this.productosRegistrados;
	}

	double getMontoTotalAPagar() {
		return this.montoTotalAPagar;
	}

	void setMontoTotalAPagar(double unMonto) {
		this.montoTotalAPagar = unMonto;
	}

	public void registrarUnProducto(Producto producto) {
		if (producto.getStock() <= 0) { // Pongo <= y no = porque sino no funciona
            throw new IllegalStateException("No hay stock del producto que quiere llevar");
        }
		this.productosRegistrados.add(producto);
		this.montoTotalAPagar += producto.getPrecio();
		producto.decrementarStock(); 
	}

	public void registrarPoductos(List<Producto> productos) {
		for (Producto producto : productos) {
			registrarUnProducto(producto);
		}
	}

	public void enviarPagoDeFacturaALaAgencia(Factura factura) {
		factura.agenciaALaQuePértenece.facturasPagas.add(factura);
	}
	
	@Override
	public void registrarPago(Factura factura) {
		enviarPagoDeFacturaALaAgencia(factura);
	}
}
