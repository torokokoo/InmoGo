package com.inmogo.api.Service;

import com.inmogo.api.Entity.User;
import com.inmogo.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository UsuarioRepo;

    //registrar usuario
    public User register(String Name, String rut, String email, String password, String role, String permission){
        User user = new User(Name,rut,email,password,role,permission);
        User existente = UsuarioRepo.findByEmail(user.getEmail());
        if (existente != null){
            return null;
        }
        return UsuarioRepo.save(user);
    }
    //login usuario
    public User login(String email, String password){
        User user = UsuarioRepo.findByEmail(email);
        if (user != null){
            if (password.equals(user.getPassword())){
                return user;
            }
        }
        return null;
    }
    public User getUsuarioById(long Id){
        return UsuarioRepo.findById(Id).get();
    }

}
