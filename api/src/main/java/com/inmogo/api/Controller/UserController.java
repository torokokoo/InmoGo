package com.inmogo.api.Controller;

import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

/**
 * Controlador para gestionar operaciones relacionadas con usuarios.
 * 
 * Proporciona endpoints para registrar, autenticar y obtener detalles de usuarios. Utiliza el servicio
 * {@link UserService} para manejar la lógica de negocio relacionada con usuarios y gestiona la transacciones
 * con el {@link DataSourceTransactionManagerAutoConfiguration}.
 */

@RestController //Es un controlador solo con datos JSON
@CrossOrigin //Permite hacer solicitudes de manera cruzadas
@RequestMapping("/api/user") //Direccion URL

public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    /**
     * Registra un nuevo usuario en el sistema y guarda sus datos en una base de datos de usuarios.
     * 
     * @param newUserTemplate Datos del nuevo usuario a registrar.
     * @return El usuario registrado. 
     */
    @PostMapping("/register")
    public UserTemplate register(@RequestBody UserTemplate newUserTemplate){
        return userService.register(newUserTemplate.getId(), newUserTemplate.getName(), newUserTemplate.getRut(), newUserTemplate.getEmail(), newUserTemplate.getPassword(), newUserTemplate.getRole());
    }

    /**
     * Autenticar (loguear) a un usuario en el sistema.
     * 
     * @param userTemplate Datos de inicio de sesión del usuario.
     * @return Autentica a un usuario en el sistema. Si no, da un aviso de 
     * 	       que las credenciales son incorrectas.
     */
    @PostMapping("/login")
    public UserTemplate login(@RequestBody UserTemplate userTemplate){
        UserTemplate res = userService.login(userTemplate.getEmail(), userTemplate.getPassword());
        if (res != null) { return res; }
        else { throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Cause description here");}
    }

    /**
     * Obtiene un usuario por su ID.
     * 
     * @param id ID del usuario a buscar
     * @return El usuario correspondiente al ID proporcionado. Si ningun usuario contiene
     * 	       el ID proporcionado, no devuelve ningun usuario.
     */
    @GetMapping("/id")
    public UserTemplate getUserById(@RequestParam("id") String id){
        System.out.printf("id por buscar" + id);
        return userService.getUserById(Integer.parseInt(id));
    }

}
