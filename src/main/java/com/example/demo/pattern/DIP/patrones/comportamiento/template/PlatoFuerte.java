package com.example.demo.pattern.DIP.patrones.comportamiento.template;

public class PlatoFuerte extends Orden {

    @Override
    void preparPedido() {

        System.out.println("Preparando Posta cartagenera");
    }

    @Override
    void verificarDisponibilidad() {
        System.out.println("verifando si hay carne");
    }
}
