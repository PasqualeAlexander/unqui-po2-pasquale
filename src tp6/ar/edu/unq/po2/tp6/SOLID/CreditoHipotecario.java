package ar.edu.unq.po2.tp6.SOLID;

public class CreditoHipotecario extends SolicitudDeCredito {
	private Propiedad garantiaDelCliente;

	public CreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad garantia) {
		this.clienteSolicitante = cliente;
		this.montoSolicitado = monto;
		this.plazoEnMeses = plazo;
		this.garantiaDelCliente = garantia;
	}

	public Propiedad getGarantiaDelCliente() {
		return this.garantiaDelCliente;
	}

	@Override
	public boolean esAceptable() {
		return laCuotaMensualNoSuperaEl50PorCientoDelSueldoDelTitular() && elSolicitanteNoSuperaLos65AñosDeEdadAntesDeTerminarDePagarElCredito() 
				&& elMontoSolicitadoNoEsMayorAl70PorCientoDelValorFiscalDeLaGarantia() ;
	}

	private  double mitadDelSueldoNetoDelSolicitante() {
		return getClienteSolicitante().getPerfilFinanciero().getSueldoNetoMensual() / 2;
	}

	private  boolean laCuotaMensualNoSuperaEl50PorCientoDelSueldoDelTitular() {
		return cuotaMensualDelCredito() < mitadDelSueldoNetoDelSolicitante();
	}

	private  boolean elMontoSolicitadoNoEsMayorAl70PorCientoDelValorFiscalDeLaGarantia() {
		return getMontoSolicitado() < ((getGarantiaDelCliente().getValorFiscal()) * 0.7);
	}

	private  boolean elSolicitanteNoSuperaLos65AñosDeEdadAntesDeTerminarDePagarElCredito() {
		return (this.clienteSolicitante.getEdad() + plazoEnMeses / 12) < 65;
	}
}