package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class FuturistaFactory implements MundoFactory {
    @Override
    public Arma crearArma() {
        return new RayoLaser(50, 5, 200);
    }

    @Override
    public Personaje crearPersonaje() {
        return new SoldadoInvierno(200, 200, 100, crearArma());
    }
}
