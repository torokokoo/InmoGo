package com.inmogo.api.Controller;

import com.inmogo.api.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/owner")

/**
 * Controlador para manejar las operaciones relacionadas con los propietarios (Owners).
 * 
 * Esta clase se encarga de recibir y procesar las solicitudes HTTP relacionadas con las operaciones
 * de propietarios, utilizando el servicio {@link OwnerService} para realizar las operaciones de negocio necesarias.
 */

public class OwnerController {
    @Autowired
    private OwnerService ownerService;

}
