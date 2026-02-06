package com.example.demo.controler.endpoint;

import com.example.demo.User;
import com.example.demo.controler.dto.UserDTO;
import com.example.demo.logica.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    UserService userService;

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable Long id) {
        log.info("consultando " + id);
        return userService.consultarUsuario(id);
    }

    @PostMapping("/user")
    public User crearUsuario(@RequestBody UserDTO userDTO) {
        return userService.crearUsuario(userDTO);
    }
}
