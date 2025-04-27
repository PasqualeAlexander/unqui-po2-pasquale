package ar.edu.unq.po2.tp5.mercadocentral;

public abstract class Factura {
	protected String id;
	protected Agencia agenciaALaQuePértenece;
	
	public Factura(String idFactura, Agencia unaAgencia) {
		this.id = idFactura;
		this.agenciaALaQuePértenece = unaAgencia;
	}

	public String getId() {
		return id;
	}
	
	public Agencia getAgencia() {
		return agenciaALaQuePértenece;
	}

	public abstract double getCosto();
}
