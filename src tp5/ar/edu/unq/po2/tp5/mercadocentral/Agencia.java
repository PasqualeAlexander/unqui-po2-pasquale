package ar.edu.unq.po2.tp5.mercadocentral;

import java.util.List;

public abstract class Agencia {
	protected List<Factura> facturasPagas;
	protected int CUIT;
	
	public Agencia(List<Factura> facturasPagas, int unCUIT) {
		this.facturasPagas = facturasPagas;
		CUIT = unCUIT;
	}

	public boolean verificarSiEstaPagaLaFactura(Factura unaFactura) {
		return facturasPagas.contains(unaFactura);
	}
}
