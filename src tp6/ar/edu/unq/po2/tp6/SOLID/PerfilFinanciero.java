package ar.edu.unq.po2.tp6.SOLID;

public class PerfilFinanciero {
	private double sueldoNetoMensual;
	
	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public double calcularSueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public void setSueldoNetoMensual(double nuevoSueldoNetoMensual) {
		this.sueldoNetoMensual = nuevoSueldoNetoMensual;
	}
}
