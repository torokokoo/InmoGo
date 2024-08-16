package com.inmogo.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inmogo.api.Repository.UserRepository;
import com.inmogo.api.Entity.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    //Register
    public User register(long id, String name, String rut, String email, String password, String role, String permission){
        User user = new User(id, name, rut, email, password, role, permission);
        User exists = userRepo.findByEmail(user.getEmail());
        System.out.println("Register");
        if (exists != null){
            return null;
        }
        return userRepo.save(user);
    }

    //Login
    public User login(String email,String password){
        User user = userRepo.findByEmail(email);
        System.out.println("Login");
        if (user != null){
            if (password.equals(user.getPassword())){
                return user;
            }
        }
        return null;
    }

    //Busqueda por ID
    public User getUserById(long Id){
        return userRepo.findById(Id).orElse(null);
    }

}