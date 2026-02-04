package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class EstadoCreado implements EstadoPedido {
    @Override
    public void pagar(PedidoNew pedido) {
        System.out.println("Logica para pagar el peodido bla bla");
        pedido.setEstadoPedido(new EstadoPagado());
    }

    @Override
    public void enviar(PedidoNew pedido) {
        System.out.println("No se realiza accion debido a que esta " + pedido.getEstadoPedido());
    }

    @Override
    public void cancelar(PedidoNew pedido) {
        System.out.println("Logica para pagar el cancelar bla bla");
        pedido.setEstadoPedido(new EstadoCancelado());
    }

    @Override
    public void entregar(PedidoNew pedido) {
        System.out.println("No se realiza accion debido a que esta " + pedido.getEstadoPedido());
    }
}
