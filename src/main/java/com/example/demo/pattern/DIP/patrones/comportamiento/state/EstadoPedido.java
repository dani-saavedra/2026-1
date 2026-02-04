package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public interface EstadoPedido {

    void pagar(PedidoNew pedido);

    void enviar(PedidoNew pedido);

    void cancelar(PedidoNew pedido);

    void entregar(PedidoNew pedido);
}
