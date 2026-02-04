package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class Espada implements Arma {

    private int danio;
    private int durabilidad;
    private int alcance;

    public Espada(int danio, int durabilidad, int alcance) {
        this.danio = danio;
        this.durabilidad = durabilidad;
        this.alcance = alcance;
    }

    @Override
    public void usar() {
        durabilidad--;
        System.out.println("Espada usada");
    }

    @Override
    public int getDanio() {
        return danio;
    }

    @Override
    public int getAlcance() {
        return alcance;
    }

    @Override
    public int getDurabilidad() {
        return durabilidad;
    }
}
