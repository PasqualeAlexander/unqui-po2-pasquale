package ar.edu.unq.po2.tp4.supermercado;

public class IngresoPorHorasExtras extends Ingreso {
    private int cantidadHoras;

    public IngresoPorHorasExtras(String mes, String concepto, double monto, int cantidadHoras) {
        super(mes, concepto, monto);
        this.cantidadHoras = cantidadHoras;
    }
    
    public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	@Override
    public double getMontoImponible() {
        return 0;
    }
}
