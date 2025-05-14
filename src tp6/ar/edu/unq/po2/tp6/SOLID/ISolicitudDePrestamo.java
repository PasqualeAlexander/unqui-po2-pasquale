package ar.edu.unq.po2.tp6.SOLID;

public interface ISolicitudDePrestamo {
	public boolean esAceptable();
	public double getMontoSolicitado();
	public int getPlazoEnMeses();
	public Cliente getClienteSolicitante();
}
