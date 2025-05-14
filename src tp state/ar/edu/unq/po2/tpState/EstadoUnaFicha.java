package ar.edu.unq.po2.tpState;

public class EstadoUnaFicha extends Estado {
	private MaquinaVideojuego maquina;

	public EstadoUnaFicha(MaquinaVideojuego maquina) {
		super(maquina);
	}

	@Override
	public void insertarFicha() {
		System.out.println("Se ingresó una segunda ficha. Listo para dos jugadores.");
		maquina.setEstado(new EstadoDosFichas(maquina));
	}

	@Override
	public void presionarBotonInicio() {
		System.out.println("Iniciando juego para un jugador...");
		maquina.setEstado(new EstadoJugando(maquina, 1));
	}

	@Override
	public void terminarJuego() {
		System.out.println("Finalizando partida...");
	}
}
