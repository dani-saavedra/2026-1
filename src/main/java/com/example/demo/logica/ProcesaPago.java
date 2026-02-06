package com.example.demo.logica;

import com.example.demo.Notificacion;
import org.springframework.stereotype.Service;

@Service
public class ProcesaPago {

    public static final int MONTO_MAXIMO_HABILITADO_BRE_B = 1000;
    Notificacion notificacion;

    public ProcesaPago(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public double calcularInteres(String tipoCliente, int monto) {
        //Random, una fecha calculada, un timestamp
        notificacion.notificar(monto);
        if ("Premium".equals(tipoCliente) && monto > MONTO_MAXIMO_HABILITADO_BRE_B) {
            return (monto * 15) / 100;
        } else if ("Normal".equals(tipoCliente)) {
            return (monto * 25) / 100;
        } else {
            return (monto * 5) / 100;
        }
        //llamado a la base de datos
    }

    public String procesarPago(String tipoCliente, int monto) {
        if (monto > MONTO_MAXIMO_HABILITADO_BRE_B) { //Magic number, Code smell.
            throw new IllegalArgumentException("Monto no permitido");
        }
        if (tipoCliente.equals("Premium")) {
            return "PSE";
        } else {
            return "ACH";
        }
    }
}
