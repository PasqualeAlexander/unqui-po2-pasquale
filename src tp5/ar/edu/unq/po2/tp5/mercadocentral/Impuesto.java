package ar.edu.unq.po2.tp5.mercadocentral;

public class Impuesto extends Factura {
	protected double tasaDeServicio;
	
	public Impuesto(String idFactura, double unaTasaDeServicio, Agencia unaAgencia) {
		super(idFactura, unaAgencia);
		this.tasaDeServicio = unaTasaDeServicio;
	}

	@Override
	public double getCosto() {
		return this.tasaDeServicio;
	}

	public void setTasaDeServicio(double nuevaTasa) {
		this.tasaDeServicio = nuevaTasa;
	}
}