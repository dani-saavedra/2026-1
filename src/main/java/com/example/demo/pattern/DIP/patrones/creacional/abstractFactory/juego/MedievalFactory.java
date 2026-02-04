package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class MedievalFactory implements MundoFactory {
    @Override
    public Arma crearArma() {
        return new Espada(20, 10, 2);
    }

    @Override
    public Personaje crearPersonaje() {
        return new Guerrero(100, 100, 10, crearArma());
    }
}
