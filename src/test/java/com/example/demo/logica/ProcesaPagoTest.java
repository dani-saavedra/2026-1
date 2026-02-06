package com.example.demo.logica;

import com.example.demo.Notificacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProcesaPagoTest {

    @Mock
    Notificacion notificacion;

    @InjectMocks
    ProcesaPago procesaPago;

    @Test
    void CalcularInteresClientePremiun_Es_15() {
        double result = procesaPago.calcularInteres("Premium", 2000);
        Assertions.assertEquals(300.0, result);
        Mockito.verify(notificacion).notificar(2000);
    }


    @Test
    void CalcularInteresClienteNormal_Es_25() {
        double result = procesaPago.calcularInteres("Normal", 2000);
        Assertions.assertEquals(500.0, result);
        Mockito.verify(notificacion).notificar(2000);
    }

    //The next level play.
    @Test
    void Cuando_CalculoInteresPorDefecto_5p() {
        double result = procesaPago.calcularInteres("Premium", 1000);
        Assertions.assertEquals(50.0, result);
        Mockito.verify(notificacion).notificar(1000);
    }
    //Los unit Test, estan para representar la logica de negocio
    //las validaciones en Código.
    // ESTAN PARA REPRESENTAR LAS REGLAS DE NEGOCIO.


    @Test
    void Dado_MontoNopermitido_CuandoProcesePago_Entonces_ArrojaException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> procesaPago.procesarPago("Premium", 2000));
    }

    @Test
    void x() {
        String response = procesaPago.procesarPago("Premium", 1000);
        Assertions.assertEquals("PSE", response);
    }
}