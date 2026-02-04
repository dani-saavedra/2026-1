package com.example.demo.pattern.DIP.patrones.estructural.proxy.carpeta;

import DIP.patrones.estructural.proxy.Internet;

public class Service implements Internet {
    @Override
    public String navegar(String url) {
        return "Obteniendo contenido de " + url;
    }
}
