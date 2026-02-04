package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.disenador;

public class DisenadorInterior {

    public void disenarCasa(String estilo) {
        if (estilo.equals("Victoriano")) {
            Sofa sofaVictoriano = new SofaVictoriana();
            Silla sillaVictoriana = new SillaVictoriana();
        } else if (estilo.equals("Moderno")) {
            Sofa sofaModerno = new SofaModerna();
            Silla sillaModerno = new SillaModerna();
        }else if (estilo.equals("Art Deco")) {
            //
        }
        else if (estilo.equals("economico")) {
            //
        }
    }
}
