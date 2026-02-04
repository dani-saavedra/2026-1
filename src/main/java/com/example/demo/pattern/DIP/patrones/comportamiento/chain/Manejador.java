package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

public interface Manejador {

    boolean valida(Moneda moneda);

    int getValor();

}
