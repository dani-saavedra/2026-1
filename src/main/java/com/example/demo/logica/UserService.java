package com.example.demo.logica;

import com.example.demo.User;
import com.example.demo.controler.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    public User consultarUsuario(Long id) {
        return repository.findById(id).get();
    }

    public User crearUsuario(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.email());
        user.setName(userDTO.name());
        return repository.save(user);
    }
}
