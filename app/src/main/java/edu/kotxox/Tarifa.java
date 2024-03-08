package edu.kotxox;

public class Tarifa {
    private static final double COSTE_MILLA = 1.35;
    private static final double COSTE_MINUTO = 0.35;
    private static final double COSTE_MINIMO = 5.0;
    private static final byte PORCENTAJE_COMISION = 20;

    Tarifa(){

    }

    public static double getCosteDistancia(double distancia){
        return Tarifa.COSTE_MILLA * distancia;
    }

    public static double getCosteTiempo(int tiempo){
        return Tarifa.COSTE_MINUTO * tiempo;
    }

    public static double getCosteTotalEsperado(Carrera carrera){
        double costeReal = Tarifa.getCosteDistancia(carrera.getDistancia()) +
                           Tarifa.getCosteTiempo(carrera.getTiempoEsperado());
        return costeReal > Tarifa.COSTE_MINIMO ? costeReal : Tarifa.COSTE_MINIMO;
    }



}
