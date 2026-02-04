package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

public class Manejador200 implements Manejador {

    @Override
    public boolean valida(Moneda moneda) {
        return moneda.getTexto().equals("200") && moneda.getMasa() == 2;
    }

    @Override
    public int getValor() {
        return 200;
    }
}
