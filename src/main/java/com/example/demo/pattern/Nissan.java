package com.example.demo.pattern;

public class Nissan implements Carro {
    @Override
    public int precio() {
        return 100;
    }

    @Override
    public String getMarca() {
        return "Nissan";
    }

    public int getPuertas() {
        return 4;
    }
}
