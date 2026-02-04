package com.example.demo.pattern.DIP.patrones.estructural.proxy.carpeta;

import DIP.patrones.estructural.proxy.Internet;

public class Proxy implements Internet {

    private Service service;

    public Proxy() {
        this.service = new Service();
    }

    @Override
    public String navegar(String url) {
        if (url.contains("xxx") || url.contains("youtube")) {
            throw new IllegalArgumentException("No puede navegar en estos sitios, sera reportado al decano");
        }
        return service.navegar(url);
    }
}
