package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class VideoJuego {

    private Personaje personaje;

    public VideoJuego(MundoFactory mundoFactory) {
        this.personaje = mundoFactory.crearPersonaje();
    }

    public void iniciar() {
        personaje.atacar();
    }
}
