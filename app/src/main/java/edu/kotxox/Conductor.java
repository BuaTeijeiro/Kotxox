package edu.kotxox;

import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private ArrayList<Byte> valoraciones;

    public Conductor() {
    }
    public Conductor(String nombre) {
        this.nombre = nombre;
        this.valoraciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setValoracion(byte newValoracion){
        this.valoraciones.add(newValoracion);
    }

    public int getNumeroValoraciones(){
        return this.valoraciones.size();
    }

    public void setValoracionMedia(){
        this.valoracionMedia = this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia(){
        if (this.valoraciones.isEmpty()) {
            return 0;
        }
        double media = 0.0f;
        for(Byte valoracion: this.valoraciones){
            media += valoracion;
        }

        return media/this.valoraciones.size();
    }

    public double getValoracion(){
        return this.calcularValoracionMedia();
    }


}
