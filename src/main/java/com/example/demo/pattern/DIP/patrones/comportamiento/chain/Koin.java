package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Koin {

    private List<Manejador> manejadors;

    public Koin() {
        this.manejadors = new ArrayList<>();
        manejadors.add(new Manejador500());
        manejadors.add(new Manejador200());
        manejadors.add(new Manejador1000());
    }

    public int sumarMonedas(List<Moneda> monedas) {
        int suma = 0;
        for (Moneda moneda : monedas) {
            for (Manejador manejador : manejadors) {
                if (manejador.valida(moneda)) {
                    suma += manejador.getValor();
                    break;
                }
            }
        }
        return suma;
    }
}
