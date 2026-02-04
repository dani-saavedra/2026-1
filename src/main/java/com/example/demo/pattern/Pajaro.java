package com.example.demo.pattern;

public class Pajaro implements Animal, AnimalVolador {
    @Override
    public void emitirSonido() {
        System.out.println("pio pio");
    }

    @Override
    public void comer() {
        System.out.println("Maizs");
    }

    @Override
    public void volar() {
        System.out.println("Pajaro volar");
    }
}
