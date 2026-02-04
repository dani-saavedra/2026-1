package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

public class Manejador500 implements Manejador {

    @Override
    public boolean valida(Moneda moneda) {
        return moneda.getTexto().equals("COP 500");
    }

    @Override
    public int getValor() {
        return 500;
    }
}
