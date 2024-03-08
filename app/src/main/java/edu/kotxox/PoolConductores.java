package edu.kotxox;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PoolConductores {
    List<Conductor> conductores;

    public PoolConductores() {
    }

    public PoolConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return conductores;
    }

    public Conductor asignarConductor(){
        List<Conductor> conductorLibre = this.conductores.stream().filter(c -> !c.isOcupado()).collect(Collectors.toList());
        Random aleatorio = new Random();
        Conductor conductor = conductorLibre.get(aleatorio.nextInt(conductorLibre.size()));
        conductor.setOcupado(true);
        return conductor;
    }
}
