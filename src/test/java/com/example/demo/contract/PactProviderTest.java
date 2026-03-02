package com.example.demo.contract;

import au.com.dius.pact.provider.junit5.PactVerificationContext;
import com.example.demo.entities.User;
import com.example.demo.logica.UserService;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@ActiveProfiles("test")
//@Provider("XyzService")
//@PactBroker(url = "http://localhost:9292")
public class PactProviderTest {

    @MockBean
    private UserService userService;

    //@TestTemplate
  //  @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactVerificationTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }

//    @BeforeEach
    void setupTestTarget(PactVerificationContext context) {
        System.setProperty("pact.verifier.publishResults", "true");
        System.setProperty("pact.provider.version", "1");
    }

  //  @State("El usuario con ID 1 existe")
    public void userExits() {
        Mockito.when(userService.consultarUsuario(Mockito.any()))
                .thenReturn(new User(1L, "Juan", "Perez", "juan@example.com"));
    }

}


