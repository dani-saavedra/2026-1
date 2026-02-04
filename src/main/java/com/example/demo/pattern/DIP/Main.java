package com.example.demo.pattern.DIP;

import DIP.dominio.ProcesaPago;
import DIP.infraestructura.TwilioAdapter;

public class Main {
    public static void main(String[] args) {

        ProcesaPago procesaPago = new ProcesaPago(new TwilioAdapter(), null);
        procesaPago.procesarPago("Mercedez", 500, 302546707);
    }
}
//Cuando hablamos de inversion de depdencias, vamos a tener inyeccion de depedencias.
//Pero no siempre que hagamos inyeccion de depednencias, estamos hblando de inversion de depdencias.