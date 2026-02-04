package com.example.demo.pattern.DIP.patrones.comportamiento.template;

public abstract class Orden {
    //como la toma de pedido, la preparación, la verificación de disponibilidad, el cálculo de precios

    public void atenderCliente() {
        tomarPedido();
        verificarDisponibilidad();
        preparPedido();
        calcularPrecioFactura();
    }

    private void tomarPedido() {
        //logica de toma de pedido
        System.out.println("Tomando pedido");
    }

    abstract void preparPedido();

    abstract void verificarDisponibilidad();

    private void calcularPrecioFactura() {
        //logica de calcular
        System.out.println("Calculando precio de factura");
    }
}
