package com.example.demo.logica;

import com.example.demo.Notificacion;
import org.springframework.stereotype.Service;

@Service
public class ProcesaPago {

    Notificacion notificacion;

    public ProcesaPago(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public double calcularInteres(String tipoCliente, int monto) {
        //Random, una fecha calculada, un timestamp
        notificacion.notificar(monto);
        if ("Premium".equals(tipoCliente) && monto > 1000) {
            return (monto * 15) / 100;
        } else if ("Normal".equals(tipoCliente)) {
            return (monto * 25) / 100;
        } else {
            return (monto * 5) / 100;
        }
    }


}
