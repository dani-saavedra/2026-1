package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class PedidoNew {

    private EstadoPedido estadoPedido;

    public PedidoNew() {
        this.estadoPedido = new EstadoCreado();
    }

    public void pagar() {
        estadoPedido.pagar(this);
    }

    public void enviar() {
        estadoPedido.enviar(this);
    }

    public void cancelar() {
        estadoPedido.cancelar(this);
    }

    public void entregar() {
        estadoPedido.entregar(this);
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
