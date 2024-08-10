package com.example.InmoGoBackend.Controller;

import com.example.InmoGoBackend.Entity.Usuario;
import com.example.InmoGoBackend.Service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioSer;

    //registra usuario
    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario nuevoUsuario){
        return usuarioSer.register(nuevoUsuario.getId(),nuevoUsuario.getNombre(),nuevoUsuario.getRut(),nuevoUsuario.getEmail(),nuevoUsuario.getContrasena(),nuevoUsuario.getRol(), nuevoUsuario.getPermiso());
    }
    //logea usuario
    @PostMapping("/login")
    public int login(@RequestBody Usuario usuario){
        return usuarioSer.login(usuario.getEmail(), usuario.getContrasena());
    }
    //consigue el id de usuario
    @GetMapping("/id")
    public Usuario getUsuarioById(@RequestParam("id") String id){
        System.out.printf("id por buscar" + id);
        return usuarioSer.getUsuarioById(Integer.parseInt(id));
    }
}
