package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class SoldadoInvierno implements Personaje {
    private int vida;
    private int fuerza;
    private int velocidad;
    private Arma arma;

    public SoldadoInvierno(int vida, int fuerza, int velocidad, Arma arma) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println("Soldado esta atacando con una fuerza " + fuerza + "causando un danio de " + arma.getDanio());
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getFuerza() {
        return fuerza;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
