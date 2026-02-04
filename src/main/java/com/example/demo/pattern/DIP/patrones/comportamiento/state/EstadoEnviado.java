package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class EstadoEnviado implements EstadoPedido {
    @Override
    public void pagar(PedidoNew pedido) {
        System.out.println("Ya se encuentra pagado");
    }

    @Override
    public void enviar(PedidoNew pedido) {
        System.out.println("Ya se encuentra enviado");
    }

    @Override
    public void cancelar(PedidoNew pedido) {

        System.out.println("No se puede cancelar debido a que se esta enviando");
    }

    @Override
    public void entregar(PedidoNew pedido) {

        System.out.println("Logica para entregar ");
        pedido.setEstadoPedido(new EstadoEntregado());
    }
}
