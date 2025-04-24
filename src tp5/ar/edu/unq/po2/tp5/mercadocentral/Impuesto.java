package ar.edu.unq.po2.tp5.mercadocentral;

public class Impuesto extends Factura {
	protected double tasaDeServicio;

	public Impuesto(String idImpuesto, double tasaDeServicio) {
		super(idImpuesto);
		this.tasaDeServicio = tasaDeServicio;
	}
	
	@Override
	public double getCosto() {
		return this.tasaDeServicio;
	}

	public void setTasaDeServicio(double nuevaTasa) {
		this.tasaDeServicio = nuevaTasa;
	}
}