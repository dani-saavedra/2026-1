package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class Main {
    public static void main(String[] args) {

        /*
        PedidoOld pedido = new PedidoOld();
        pedido.pagar();
        pedido.enviar();
        pedido.entregar();
        pedido.cancelar();

         */

        PedidoNew pedidoNew = new PedidoNew();
        pedidoNew.pagar();
        pedidoNew.pagar();
    }
}
