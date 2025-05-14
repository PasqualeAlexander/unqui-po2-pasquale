package ar.edu.unq.po2.tpState;

public class EstadoSinFicha extends Estado {
	private MaquinaVideojuego maquina;

	public EstadoSinFicha(MaquinaVideojuego maquina) {
		super(maquina);
	}

	@Override
	public void insertarFicha() {
		System.out.println("Se ingresó una ficha.");
		maquina.setEstado(new EstadoUnaFicha(maquina));
	}

	@Override
	public void presionarBotonInicio() {
		System.out.println("Ingrese fichas primero.");
	}

	@Override
	public void terminarJuego() {
		System.out.println("No hay juego en curso.");
	}
}
