package com.example.demo.pattern.DIP.infraestructura;

import DIP.dominio.puerto.INotificacion;

public class TwilioAdapter implements INotificacion {

    public void enviarNotificacion(int monto, int telefono) {
        //Logica para comunicarnos con Twillio (Rest)
        System.out.println("Enviando mensjae con twilio");

    }
}
