package com.inmogo.api.Service;

import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Repository.UserTemplateRepository;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserTemplateRepository userRepo;

    //Buscar por ID
    public UserTemplate findById(Long id){
        return userRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuario con ID " + id + " no encontrado."));
    }

    //Registrar en base a datos.
    public UserTemplate register(String name, String rut, String email, String password, Integer role){
        System.out.println("Registrar:");
        //Asegurarse que el RUT o el Email no se repita.
        if (userRepo.findByEmail(email).equals(null) || userRepo.findByRut(rut).equals(null)){
            return null;
        }
        return userRepo.save(new UserTemplate(name,rut,email,password,role));
    }

    //Registrar en base a un template pre-existente.
    public UserTemplate register(UserTemplate userTemplate){
        System.out.println("Registrar:");
        if (userRepo.findByEmail(userTemplate.getEmail()).equals(null) || userRepo.findByRut(userTemplate.getRut()).equals(null)){
            return null;
        }
        return userRepo.save(new UserTemplate(userTemplate));
    }

    //Login
    public UserTemplate login(String email, String password){
        UserTemplate userTemplate = userRepo.findByEmail(email);
        System.out.println("Login");
        if (userTemplate != null){
            if (password.equals(userTemplate.getPassword())){
                return userTemplate;
            }
        }
        return null;
    }
}