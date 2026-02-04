package com.example.demo.pattern;

public class Main {


    public static void main(String[] args) {
        Carro[] carros = {
                new Nissan(),
                new Mercedez(),
                new MG()
        };
        impimirPrecioCarro(carros);

    }

    private static void impimirPrecioCarro(Carro[] carros) {
        for (Carro carro : carros) {
            /*
            if (carro.getMarca().equals("Nissan")) {
                System.out.println(50);
            }
            if (carro.getMarca().equals("Mercedez")) {
                System.out.println(500);
            }
            if (carro.getMarca().equals("bmw")) {
                System.out.println(300);
            }
            if (carro.getMarca().equals("byd")) {
                System.out.println(250);
            }

             */
            System.out.println(carro.precio());
        }
    }

    private static void imprimirPuertas(Carro[] carros) {
        for (Carro carro : carros) {
            if (carro instanceof Mercedez) {
                ((Mercedez) carro).cantidadPuertas();
            }

        }
    }
    public void ingresoVehiculo(){
        //registrabamos el la hora
        //
    }

}
//Compilacion - Runtime