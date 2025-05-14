package ar.edu.unq.po2.tp6.SOLID;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private List<Cliente> clientes = new ArrayList<>();
	private List<SolicitudDeCredito> solicitudesDeCredito = new ArrayList<>();
	
	public void agregarNuevoCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void agregarNuevaSolicitudDePrestamo(SolicitudDeCredito solicitud) {
		this.solicitudesDeCredito.add(solicitud);
	}
	
	public ArrayList<SolicitudDeCredito> solicitudesAceptables(){
		ArrayList<SolicitudDeCredito> solicitudesAceptables  = new ArrayList<>();
		for (SolicitudDeCredito solicitud : solicitudesDeCredito) {
			if(solicitud.esAceptable()) {
				solicitudesAceptables.add(solicitud);
			}	
		}
		return solicitudesAceptables;
	}
	
	public double montoTotalDeDineroADesembolsar() {
		double montoTotal = 0;
		for(SolicitudDeCredito solicitud : this.solicitudesAceptables()) {
			montoTotal += solicitud.getMontoSolicitado();
		}
		return montoTotal;
	}
}
