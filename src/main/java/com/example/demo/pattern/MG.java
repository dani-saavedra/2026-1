package com.example.demo.pattern;

public class MG implements Carro {

    @Override
    public int precio() {
        return 300;
    }

    @Override
    public String getMarca() {
        return "MG";
    }
}
