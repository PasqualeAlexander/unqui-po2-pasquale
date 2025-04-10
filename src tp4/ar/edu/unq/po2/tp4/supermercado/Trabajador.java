package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Trabajador {
	ArrayList<Ingreso> ingresosPercibidosPorAño;
	double ingresosPercibidosDelAño;

	public Trabajador(ArrayList<Ingreso> ingresosPercibidosPorAño, double ingresosPercibidosDelAño) {
		this.ingresosPercibidosPorAño = ingresosPercibidosPorAño;
		this.ingresosPercibidosDelAño = ingresosPercibidosDelAño;
	}

	public ArrayList<Ingreso> getIngresosPercibidosPorAño() {
		return ingresosPercibidosPorAño;
	}

	public void setIngresosPercibidosPorAño(ArrayList<Ingreso> ingresosPercibidosPorAño) {
		this.ingresosPercibidosPorAño = ingresosPercibidosPorAño;
	}

	public double getIngresosPercibidosDelAño() {
		return ingresosPercibidosDelAño;
	}

	public void setIngresosPercibidosDelAño(double ingresosPercibidosDelAño) {
		this.ingresosPercibidosDelAño = ingresosPercibidosDelAño;
	}

	double getTotalPercibido() {
		return;
	}

	Trabajador getMontoImponible() {
		// retornar el monto imponible al impuesto al trabajador
	}

	Trabajador getImpuestoAPagar() {
		// retornar el monto a pagar por el trabajador, calculado como el 2% del monto
		// imponible
	}
}
