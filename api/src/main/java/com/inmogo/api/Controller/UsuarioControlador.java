package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Usuario;
import com.inmogo.api.Service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
@RequestMapping("/api/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioSer;
    @Autowired
    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    //registra usuario
    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario nuevoUsuario){
        return usuarioSer.register(nuevoUsuario.getNombre(),nuevoUsuario.getRut(),nuevoUsuario.getEmail(),nuevoUsuario.getPassword(),nuevoUsuario.getRol(), nuevoUsuario.getPermiso());
    }
    //logea usuario
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario){
        Usuario res = usuarioSer.login(usuario.getEmail(), usuario.getPassword());
        if (res != null) { return res; } else { throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cause description here");}
    }
    //consigue el id de usuario
    @GetMapping("/id")
    public Usuario getUsuarioById(@RequestParam("id") String id){
        System.out.printf("id por buscar" + id);
        return usuarioSer.getUsuarioById(Integer.parseInt(id));
    }
}
