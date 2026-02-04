package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

public class Manejador1000 implements Manejador {

    @Override
    public boolean valida(Moneda moneda) {
        return moneda.getTexto().equals("COP 1000");
    }

    @Override
    public int getValor() {
        return 1000;
    }
}
