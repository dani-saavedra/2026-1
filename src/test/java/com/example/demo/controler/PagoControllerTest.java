package com.example.demo.controler;

import com.example.demo.controler.dto.DTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class PagoControllerTest {


    RestClient restClient;
    @LocalServerPort
    int port;

    @BeforeEach
    void setup() {
        restClient = RestClient.create("http://localhost:" + port);
    }


    @Test
    void x() {
        Double premium = restClient.post()
                .uri("/api/calculo")
                .body(new DTO("Premium", 100)).
                retrieve()
                .body(Double.class);
        Assertions.assertEquals(5, premium.intValue());

    }
}