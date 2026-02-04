package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("1 USD", 1));
        monedas.add(new Moneda("1 SOL", 10));
        monedas.add(new Moneda("COP 200", 3));
        monedas.add(new Moneda("200", 2));
        monedas.add(new Moneda("COP 500", 2));
        monedas.add(new Moneda("COP 1000", 2));

        Koin koin = new Koin();
        int plataTotal = koin.sumarMonedas(monedas);
        System.out.println("Dinero Recibido " + plataTotal);
    }
}
