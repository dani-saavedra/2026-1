package com.example.demo.pattern.DIP.patrones.creacional.abstractFactory.juego;

public class RayoLaser implements Arma {

    private int danio;
    private int durabilidad;
    private int alcance;

    public RayoLaser(int danio, int durabilidad, int alcance) {
        this.danio = danio;
        this.durabilidad = durabilidad;
        this.alcance = alcance;
    }

    @Override
    public void usar() {
        durabilidad = durabilidad - 2;
        System.out.println("Usando el laser");
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
