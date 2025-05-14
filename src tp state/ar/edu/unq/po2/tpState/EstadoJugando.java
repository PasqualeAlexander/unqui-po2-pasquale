package ar.edu.unq.po2.tpState;

public class EstadoJugando extends Estado {
	private MaquinaVideojuego maquina;
	private int jugadores;

	public EstadoJugando(MaquinaVideojuego maquina, int jugadores) {
		super(maquina);
		this.jugadores = jugadores;
	}

	@Override
	public void insertarFicha() {
		System.out.println("No se pueden ingresar fichas durante el juego.");
	}

	@Override
	public void presionarBotonInicio() {
		System.out.println("Ya está en curso un juego de " + jugadores + " jugador(es).");
	}

	@Override
	public void terminarJuego() {
		System.out.println("Juego terminado. Volviendo al estado inicial.");
		maquina.setEstado(new EstadoSinFicha(maquina));
	}
}
