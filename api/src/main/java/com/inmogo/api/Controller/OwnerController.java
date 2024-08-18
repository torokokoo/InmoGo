package com.inmogo.api.Controller;

import com.inmogo.api.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/Api/Owner")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
    //PENDIENTE LOGICA DEL SERVICIO
}
