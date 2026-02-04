package com.example.demo.pattern.DIP.patrones.comportamiento.strategy;

public class ProcesaPago {

    public void procesarPago(double monto, TipoReporte metodoPago) {
        double comision = metodoPago.realizarPago(monto);
       /*

            if (tipoCliente.equals("Empresarial")) {
                comision = monto * 0.10;

            } else if (tipoCliente.equals("Premiun")) {
                comision = monto * 0.15;
            } else if (tipoCliente.equals("Normal")) {
                comision = monto * 0.20;
            }
        */
        monto += comision;
        //procesamos con la comision
        System.out.println(monto);
    }
}
