package com.example.demo.pattern;

public class Perro implements Animal {
    @Override
    public void emitirSonido() {
        System.out.println("wuao wuao");
    }

    @Override
    public void comer() {
        System.out.println("Croquetas");
    }

}
