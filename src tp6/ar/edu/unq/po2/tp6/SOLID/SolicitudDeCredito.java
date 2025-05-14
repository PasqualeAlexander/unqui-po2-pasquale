package ar.edu.unq.po2.tp6.SOLID;

public abstract class SolicitudDeCredito implements ISolicitudDePrestamo {
	protected Cliente clienteSolicitante;
	protected double montoSolicitado;
	protected int plazoEnMeses;
	
	public double getMontoSolicitado() {
		return this.montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return this.plazoEnMeses;
	}
	
	public Cliente getClienteSolicitante() {
		 return this.clienteSolicitante;
	}
	
	public double cuotaMensualDelCredito() {
		return this.montoSolicitado / this.plazoEnMeses;
	}
}
