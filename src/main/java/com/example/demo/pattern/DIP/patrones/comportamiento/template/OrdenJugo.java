package com.example.demo.pattern.DIP.patrones.comportamiento.template;

public class OrdenJugo extends Orden {

    @Override
    void preparPedido() {

        System.out.println("Preparando juguito");
    }

    @Override
    void verificarDisponibilidad() {
        System.out.println("verifando si hay fruta");
    }
}
