package com.example.demo.pattern.DIP.infraestructura;

import DIP.dominio.puerto.INotificacion;

public class AldeamoAdapter implements INotificacion {

    public void enviarNotificacion(int monto, int telefono) {
        //Logica para comunicarnos con Aldeamo (Kafka)
        System.out.println("Enviando mensjae con Aldeamo con kafka");

    }
}
