package com.inmogo.api.Controller;

import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
@RequestMapping("/api/userTemplate")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    //registra usuario
    @PostMapping("/register")
    public UserTemplate register(@RequestBody UserTemplate newUserTemplate){
        return userService.register(newUserTemplate.getId(), newUserTemplate.getName(), newUserTemplate.getRut(), newUserTemplate.getEmail(), newUserTemplate.getPassword(), newUserTemplate.getRole(), newUserTemplate.getPermission(),newUserTemplate.getChatHistory());
    }

    //logea usuario
    @PostMapping("/login")
    public UserTemplate login(@RequestBody UserTemplate userTemplate){
        UserTemplate res = userService.login(userTemplate.getEmail(), userTemplate.getPassword());
        if (res != null) { return res; }
        else { throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Cause description here");}
    }

    //consigue el id de usuario
    @GetMapping("/id")
    public UserTemplate getUserById(@RequestParam("id") String id){
        System.out.printf("id por buscar" + id);
        return userService.getUserById(Integer.parseInt(id));
    }

}