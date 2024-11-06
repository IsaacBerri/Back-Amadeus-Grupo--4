package com.example.nodo.demo.service;

import com.example.nodo.demo.models.UserEntity;
import com.example.nodo.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSevice {

    @Autowired
    private UserRepository userRepository;

    public void create(UserEntity userEntity) {
        userRepository.save(userEntity);
        System.out.println("El usuario ha sido creado con exito");
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(int id) {
        return userRepository.findById(id);
    }

    public String delete(int id) {
        userRepository.deleteById(id);
        return "La persona con ID: " + id + " ha sido eliminada";
    }

}
