package com.example.demo.pattern.DIP.patrones.comportamiento.state;

public class PedidoOld {

    //Mezclamos la logica de negocio con el control del flujo.

    private Estado estadoPedido = Estado.CREADO;

    public void pagar() {
        if (estadoPedido == Estado.CREADO) {
            System.out.println("Logica para pagar el pedido bla bla bla");
            estadoPedido = Estado.PAGADO;
        } else {
            System.out.println("Imposible pagar en el estado " + estadoPedido);
        }
    }

    public void enviar() {
        if (estadoPedido == Estado.PAGADO) {
            System.out.println("Logica para enviar el pedido bla bla bla");
            estadoPedido = Estado.ENVIADO;
        } else {
            System.out.println("Imposible enviar en el estado " + estadoPedido);
        }
    }

    public void cancelar() {
        if (estadoPedido == Estado.CREADO || estadoPedido == Estado.PAGADO) {
            System.out.println("Logica para CANCELAR el pedido bla bla bla");
            estadoPedido = Estado.CANCELADO;
        } else {
            System.out.println("Imposible cancelar en el estado " + estadoPedido);
        }
    }

    public void entregar() {
        if (estadoPedido == Estado.ENVIADO) {
            System.out.println("Logica para ENTREGAR el pedido bla bla bla");
            estadoPedido = Estado.ENTREGADO;
        } else {
            System.out.println("Imposible entregar en el estado " + estadoPedido);
        }
    }
}
