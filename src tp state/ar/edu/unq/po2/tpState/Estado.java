package ar.edu.unq.po2.tpState;

public abstract class Estado implements IEstado{
	protected MaquinaVideojuego maquina;

    public Estado(MaquinaVideojuego maquina) {
        this.maquina = maquina;
    }

    public void insertarFicha() {
        System.out.println("Acción no válida en este estado.");
    }

    public void presionarBotonInicio() {
        System.out.println("Acción no válida en este estado.");
    }

    public void terminarJuego() {
        System.out.println("Acción no válida en este estado.");
    }
}
