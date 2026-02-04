package com.example.demo.pattern.DIP.patrones.comportamiento.chain;

public class Moneda {

    String texto;
    int masa;
    String material;

    public Moneda(String texto, int masa) {
        this.texto = texto;
        this.masa = masa;
    }

    public String getTexto() {
        return texto;
    }

    public int getMasa() {
        return masa;
    }

    public String getMaterial() {
        return material;
    }
}
