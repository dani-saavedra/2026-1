package com.example.demo.pattern.DIP.patrones.estructural.proxy;

import DIP.patrones.estructural.proxy.carpeta.Proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new Proxy();
        String resultado = internet.navegar("panchitas.xxx");
        System.out.println(resultado);
    }
}
