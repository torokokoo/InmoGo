package com.inmogo.api.Service;

import com.inmogo.api.Entity.Usuario;
import com.inmogo.api.Repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio UsuarioRepo;

    //registrar usuario
    public Usuario register(String nombre,String rut,String email,String password,String rol,String permiso){
        Usuario usuario = new Usuario(nombre,rut,email,password,rol,permiso);
        Usuario existente = UsuarioRepo.findByEmail(usuario.getEmail());
        if (existente != null){
            return null;
        }
        return UsuarioRepo.save(usuario);
    }
    //login usuario
    public Usuario login(String email,String password){
        Usuario usuario = UsuarioRepo.findByEmail(email);
        if (usuario != null){
            if (password.equals(usuario.getPassword())){
                return usuario;
            }
        }
        return null;
    }
    public Usuario getUsuarioById(long Id){
        return UsuarioRepo.findById(Id).get();
    }

}
