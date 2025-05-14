package ar.edu.unq.po2.tpState;

public class MaquinaVideojuego {
	private IEstado estadoActual;

	public MaquinaVideojuego() {
		this.estadoActual = new EstadoSinFicha(this);
	}

	public void setEstado(IEstado estado) {
		this.estadoActual = estado;
	}

	public void insertarFicha() {
		estadoActual.insertarFicha();
	}

	public void presionarBotonInicio() {
		estadoActual.presionarBotonInicio();
	}

	public void terminarJuego() {
		estadoActual.terminarJuego();
	}
}
