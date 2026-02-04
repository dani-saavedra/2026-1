package com.example.demo.pattern;

public class Mercedez implements Carro {

    @Override
    public int precio() {
        return 500;
    }

    @Override
    public String getMarca() {
        return "Mercho";
    }

    public int cantidadPuertas(){
        return 2;
    }
}
