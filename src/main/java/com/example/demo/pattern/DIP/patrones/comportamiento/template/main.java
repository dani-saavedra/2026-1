package com.example.demo.pattern.DIP.patrones.comportamiento.template;

public class main {
    public static void main(String[] args) {
        Orden orden1 = new OrdenJugo();
        orden1.atenderCliente();

        System.out.println("---------");
        Orden orden2 = new PlatoFuerte();
        orden2.atenderCliente();
    }
}
