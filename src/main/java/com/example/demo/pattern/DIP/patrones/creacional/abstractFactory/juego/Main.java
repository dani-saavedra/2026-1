package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class Main {
    public static void main(String[] args) {
        VideoJuego videoJuegoFutu = new VideoJuego(new FuturistaFactory());
        videoJuegoFutu.iniciar();


        VideoJuego estiloMedieval = new VideoJuego(new MedievalFactory());
        estiloMedieval.iniciar();
    }
}
