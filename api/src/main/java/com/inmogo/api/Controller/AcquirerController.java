package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Acquirer;
import com.inmogo.api.Service.AcquirerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para manejar las operaciones relacionadas con adquirientes (Acquirers).
 * 
 * Esta clase se encarga de recibir y procesar las solicitudes HTTP relacionadas con las operaciones
 * de adquirientes, como el registro de nuevos adquirientes. Utiliza el servicio {@link AcquirerService}
 * para realizar las operaciones de negocio necesarias. También está configurado para manejar la transacción
 * con el {@link DataSourceTransactionManagerAutoConfiguration}.
 * 
 * Atributos:
 * - acquirerService: Servicio para gestionar las operaciones relacionadas con adquirientes, como el registro.
 * - dataSourceTransactionManagerAutoConfiguration: Configuración para manejar la gestión de transacciones en la base de datos.
 */
 
@RestController
@CrossOrigin
@RequestMapping("/api/acquirer")
public class AcquirerController {
    @Autowired
    private AcquirerService acquirerService;
    @Autowired
    private DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    /**
     * Registra un nuevo adquiriente en el sistema.
     * 
     * Este método maneja una solicitud HTTP POST para registrar un nuevo adquiriente. 
     * El adquiriente se pasa en el cuerpo de la solicitud como un objeto JSON, 
     * y el método llama al servicio correspondiente para completar el registro.
     * 
     * @param newAcquirer El objeto {@link Acquirer} que contiene la información del nuevo adquiriente,
     *                    incluyendo el ID, nombre, RUT, correo electrónico y contraseña.
     * 
     * @return El objeto {@link Acquirer} registrado, que incluye el ID asignado y cualquier otra información
     *         relevante que pueda ser generada o modificada durante el proceso de registro.
     */
    @PostMapping("/register")
    public Acquirer register(@RequestBody Acquirer newAcquirer){
        return acquirerService.register(newAcquirer.getId(), newAcquirer.getName(), newAcquirer.getRut(), newAcquirer.getEmail(), newAcquirer.getPassword());
    }
}
