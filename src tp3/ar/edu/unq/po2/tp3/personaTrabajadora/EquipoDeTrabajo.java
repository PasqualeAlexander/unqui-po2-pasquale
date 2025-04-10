package ar.edu.unq.po2.tp3.personaTrabajadora;

import java.util.ArrayList;

public class EquipoDeTrabajo {
    private String nombreDelEquipo;
    private ArrayList<PersonaTrabajadora> integrantes;
    
    public EquipoDeTrabajo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.integrantes = new ArrayList<>();
    }

    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }
    
    public ArrayList<PersonaTrabajadora> getIntegrantes(){
    	return integrantes;
    }
    
    public void agregarIntegrante(PersonaTrabajadora persona) {
        integrantes.add(persona);
    }
    
    private int sumarEdadesIntegrantes() {
        int total = 0;
        for (PersonaTrabajadora persona : integrantes) {
            total += persona.getEdad();
        }
        return total;
    }
    
    public double promedioEdadIntegrantes() {
        if (integrantes.isEmpty()) {
            return 0;
        }
        return sumarEdadesIntegrantes() / integrantes.size();
    }
}

