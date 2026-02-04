package com.example.demo.pattern.DIP.patrones.creacional.singleton;

public class ConexionDB {

    private static ConexionDB instance;

    private ConexionDB() {

    }

    public static ConexionDB getInstance() {
        if (instance == null) {
            instance = new ConexionDB();
            //Conexion a la base de datos.
        }
        return instance;
    }
}
