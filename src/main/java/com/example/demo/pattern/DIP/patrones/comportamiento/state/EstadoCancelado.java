package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class EstadoCancelado implements EstadoPedido {
    @Override
    public void pagar(PedidoNew pedido) {

    }

    @Override
    public void enviar(PedidoNew pedido) {

    }

    @Override
    public void cancelar(PedidoNew pedido) {

    }

    @Override
    public void entregar(PedidoNew pedido) {

    }
}
