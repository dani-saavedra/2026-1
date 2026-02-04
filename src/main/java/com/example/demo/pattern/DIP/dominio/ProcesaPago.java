package com.example.demo.pattern.DIP.dominio;

import DIP.dominio.puerto.INotificacion;

public class ProcesaPago {

    private INotificacion notificacion;
    private ImpuestoService impuestoService;

    public ProcesaPago(INotificacion notificacion, ImpuestoService impuestoService) {
        this.notificacion = notificacion;
        this.impuestoService = impuestoService;
    }

    public void procesarPago(String producto, int monto, int telefono) {
        int montoImpuestos = impuestoService.calcularImpuestos(monto);
        //Logica procesar el pago
        System.out.println("Haciendo la logica de pago");
        //Notificacion notificacion = new Notificacion();
        notificacion.enviarNotificacion(monto, telefono);
    }
    //Arquitectura Hexagonal (Puertos y adaptadores)
}
