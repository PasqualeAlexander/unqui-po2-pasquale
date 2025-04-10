package ar.edu.unq.po2.tp4.supermercado;

public class IngresoPorHorasExtras extends Ingreso {
	int cantidadDeHorasExtrasRealizadas;
	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido) {
		super(mesDePercepcion, concepto, montoPercibido);
	}

	public int getCantidadDeHorasExtrasRealizadas() {
		return cantidadDeHorasExtrasRealizadas;
	}

	public void setCantidadDeHorasExtrasRealizadas(int cantidadDeHorasExtrasRealizadas) {
		this.cantidadDeHorasExtrasRealizadas = cantidadDeHorasExtrasRealizadas;
	}
	
	
}
