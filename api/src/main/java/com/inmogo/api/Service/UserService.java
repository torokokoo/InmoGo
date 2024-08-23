package com.inmogo.api.Service;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inmogo.api.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    //Register
    public UserTemplate register(long id, String name, String rut, String email, String password, Integer role){
        UserTemplate userTemplate = new UserTemplate(id, name, rut, email, password, role);
        UserTemplate exists = userRepo.findByEmail(userTemplate.getEmail());
        System.out.println("Register");
        if (exists != null){
            return null;
        }
        return userRepo.save(userTemplate);
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

    //Busqueda por ID
    public UserTemplate getUserById(long Id){
        return userRepo.findById(Id).orElse(null);
    }

}