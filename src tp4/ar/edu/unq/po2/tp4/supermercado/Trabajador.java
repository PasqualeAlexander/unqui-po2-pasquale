package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresosPercibidosPorAño;

	public Trabajador(ArrayList<Ingreso> ingresosPercibidosPorAño) {
		this.ingresosPercibidosPorAño = ingresosPercibidosPorAño;
	}

	public ArrayList<Ingreso> getIngresosPercibidosPorAño() {
		return ingresosPercibidosPorAño;
	}

	public void setIngresosPercibidosPorAño(ArrayList<Ingreso> ingresosPercibidosPorAño) {
		this.ingresosPercibidosPorAño = ingresosPercibidosPorAño;
	}

	double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso ingreso : ingresosPercibidosPorAño) {
			totalPercibido += ingreso.getMontoPercibido();
		}
		return totalPercibido;
	}

	public double getMontoImponible() {
		double montoImponibleTotal = 0;
		for (Ingreso ingreso : ingresosPercibidosPorAño) {
			montoImponibleTotal += ingreso.getMontoImponible();
		}
		return montoImponibleTotal;
	}

	public double getImpuestoAPagar() {
		return getMontoImponible() * 0.02;
	}
}
