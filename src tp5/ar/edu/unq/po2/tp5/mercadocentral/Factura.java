package ar.edu.unq.po2.tp5.mercadocentral;

public abstract class Factura {
	private String id;

	public Factura(String idFactura) {
		this.id = idFactura;
	}

	public String getId() {
		return id;
	}

	public abstract double getCosto();
}
