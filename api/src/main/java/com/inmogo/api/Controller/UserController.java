package com.inmogo.api.Controller;

import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController //Es un controlador solo con datos JSON
@CrossOrigin //Permite hacer solicitudes de manera cruzadas
@RequestMapping("/api/user") //Direccion URL

//Se crea la clase de controlador para el usuario base
public class UserController {
    @Autowired
    private UserService userService;

    //Guardar los datos de un usuario en la base de datos
    @PostMapping("/register")
    public UserTemplate register(@RequestBody UserTemplate newUserTemplate){
        return userService.register(newUserTemplate);
    }

    //logea usuario
    @PostMapping("/login")
    public UserTemplate login(@RequestBody UserTemplate userTemplate){
        UserTemplate res = userService.login(userTemplate.getEmail(), userTemplate.getPassword());
        if (res != null) {
            return res;
        }
        else {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Credenciales invalidas.");
        }
    }

    //Busca al usuario por su ID
    @GetMapping("/{id}")
    public UserTemplate findById(@PathVariable Long id){
        System.out.println("ID por Buscar: " + id);
        return userService.findById(id);
    }
}