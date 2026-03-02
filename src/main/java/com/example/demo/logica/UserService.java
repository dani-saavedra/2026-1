package com.example.demo.logica;

import com.example.demo.entities.User;
import com.example.demo.controler.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    public User consultarUsuario(Long id) {
        return repository.findById(id).get();
    }

    public List<User> consultarUsuarios() {
        return repository.findAll();
    }

    public User crearUsuario(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.email());
        user.setName(userDTO.name());
        user.setLast_names(userDTO.lastName());
        return repository.save(user);
    }
}
