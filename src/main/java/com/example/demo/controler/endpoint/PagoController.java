package com.example.demo.controler.endpoint;

import com.example.demo.controler.dto.DTO;
import com.example.demo.logica.ProcesaPago;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagoController {

    ProcesaPago procesaPago;

    public PagoController(ProcesaPago procesaPago) {
        this.procesaPago = procesaPago;
    }

    @PostMapping("/api/calculo")
    public double calculo(@RequestBody DTO dto) {
        return procesaPago.calcularInteres(dto.tipoCliente(), dto.monto());
    }
}
