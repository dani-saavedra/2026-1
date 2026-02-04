package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class EstadoPagado implements EstadoPedido {
    @Override
    public void pagar(PedidoNew pedido) {
        System.out.println("Esto ya esta pagado");
    }

    @Override
    public void enviar(PedidoNew pedido) {
        System.out.println("Logica para enviar el pedido");
        pedido.setEstadoPedido(new EstadoEnviado());
    }

    @Override
    public void cancelar(PedidoNew pedido) {
        System.out.println("Logica para cancelar");
        pedido.setEstadoPedido(new EstadoCancelado());
    }

    @Override
    public void entregar(PedidoNew pedido) {
        System.out.println("No se puede entregar el pedido");
    }
}
