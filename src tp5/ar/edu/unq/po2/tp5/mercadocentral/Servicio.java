package ar.edu.unq.po2.tp5.mercadocentral;

public class Servicio extends Factura {
	double costoPorUnidadConsumida;
	double cantidadDeUnidadesConsumidasEnElPeriodoFacturado;

	public Servicio(String idServicio , double nuevoCostoPorUnidadConsumida, double nuevoCostoPorCantidadDeUnidadesConsumidasEnElPeriodoFacturado) {
		super(idServicio);
		this.costoPorUnidadConsumida = nuevoCostoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidasEnElPeriodoFacturado = nuevoCostoPorCantidadDeUnidadesConsumidasEnElPeriodoFacturado;
	}

	@Override
	public double getCosto() {
		return this.costoPorUnidadConsumida * this.cantidadDeUnidadesConsumidasEnElPeriodoFacturado;
	}
}
