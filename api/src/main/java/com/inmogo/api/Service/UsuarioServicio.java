package com.inmogo.api.Service;

import com.inmogo.api.Entity.HistorialChat;
import com.inmogo.api.Entity.Usuario;
import com.inmogo.api.Repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioServicio {
    private UsuarioRepositorio UsuarioRepo;

    //registrar usuario
    public Usuario register(long Id, String Nombre, String Rut, String Email, String Contrasena, String Rol, String Permiso, ArrayList<HistorialChat> Historial){
        Usuario usuario = new Usuario(Id,Nombre,Rut,Email,Contrasena,Rol,Permiso,Historial);
        Usuario existente = UsuarioRepo.findByEmail(usuario.getEmail());
        if (existente != null){
            return null;
        }
        return UsuarioRepo.save(usuario);
    }
    //login usuario
    public int login(String Email,String contrasena){
        Usuario usuario = UsuarioRepo.findByEmail(Email);
        if (usuario != null){
            if (contrasena.equals(usuario.getContrasena())){
                if (usuario.getRol().equals("Usuario")){
                    return 1;
                }
            }
        }
        return 0;
    }
    public Usuario getUsuarioById(long Id){
        return UsuarioRepo.findById(Id).get();
    }

}
