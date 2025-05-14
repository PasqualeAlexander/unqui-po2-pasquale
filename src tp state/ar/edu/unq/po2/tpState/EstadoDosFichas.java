package ar.edu.unq.po2.tpState;

public class EstadoDosFichas extends Estado {
	private MaquinaVideojuego maquina;

	public EstadoDosFichas(MaquinaVideojuego maquina) {
		super(maquina);
	}

	@Override
	public void insertarFicha() {
		System.out.println("Ya hay dos fichas ingresadas. Presione inicio.");
	}

	@Override
	public void presionarBotonInicio() {
		System.out.println("Iniciando juego para dos jugadores...");
		maquina.setEstado(new EstadoJugando(maquina, 2));
	}

	@Override
	public void terminarJuego() {
		System.out.println("No hay juego en curso.");
	}
}
