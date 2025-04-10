package ar.edu.unq.po2.tp4.supermercado;

public class Ingreso {
	String mesDePercepcion;
	String concepto;
	double montoImponible;

	public Ingreso(String mesDePercepcion, String concepto, double montoImponible) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoImponible = montoImponible;
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMontoPercibido() {
		return montoImponible;
	}

	public double getMontoImponible() {
		return montoImponible;
	}
	
	public void setMontoPercibido(double montoImponible) {
		this.montoImponible = montoImponible;
	}

}
