package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void test1() {
        //AAA
        //Arrange = Preparación de la data
        //Act: Ejecuccion del metodo
        //Assertion: Validación.
        int resultado = calculadora.sumar(10, 20);
        Assertions.assertEquals(30, resultado);

        //First:
        //F: Rapidaz
        //I: Independientes.
        //R: Repetibles.
        //S: se debe saber pa que esta Y  si falla saber porque falla
        //T: A tiempo.
    }

}