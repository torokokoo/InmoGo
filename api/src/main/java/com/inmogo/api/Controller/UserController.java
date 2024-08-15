package com.inmogo.api.Controller;

import com.inmogo.api.Entity.User;
import com.inmogo.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    //registra usuario
    @PostMapping("/register")
    public User register(@RequestBody User newUser){
        return userService.register(newUser.getId(), newUser.getName(), newUser.getRut(), newUser.getEmail(), newUser.getPassword(), newUser.getRole(), newUser.getPermission());
    }

    //logea usuario
    @PostMapping("/login")
    public User login(@RequestBody User user){
        User res = userService.login(user.getEmail(), user.getPassword());
        if (res != null) { return res; }
        else { throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Cause description here");}
    }

    //consigue el id de usuario
    @GetMapping("/id")
    public User getUserById(@RequestParam("id") String id){
        System.out.printf("id por buscar" + id);
        return userService.getUserById(Integer.parseInt(id));
    }
}