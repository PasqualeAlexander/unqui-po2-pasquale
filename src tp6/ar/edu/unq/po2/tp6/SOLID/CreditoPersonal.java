package ar.edu.unq.po2.tp6.SOLID;

public class CreditoPersonal extends SolicitudDeCredito {

	public CreditoPersonal(Cliente cliente, double monto, int plazo) {
		this.clienteSolicitante = cliente;
		this.montoSolicitado = monto;
		this.plazoEnMeses = plazo;
	}
	
	private double setentaPorCientoDelSueldoNetoDelSolicitante(){
		return getClienteSolicitante().getPerfilFinanciero().getSueldoNetoMensual() * 0.7;
	}
	
	private boolean laCuotaMensualNoSuperaEl70PorCientoDelSueldoDelTitular() {
		return cuotaMensualDelCredito() < setentaPorCientoDelSueldoNetoDelSolicitante();
	}
	
	private boolean elSolicitanteGanaMasDe15000AlAño(){
		return getClienteSolicitante().getSueldoNetoAnual() > 15000;
}
	
	@Override
	public boolean esAceptable() {
		return elSolicitanteGanaMasDe15000AlAño() && laCuotaMensualNoSuperaEl70PorCientoDelSueldoDelTitular() ;
	}

	
}
