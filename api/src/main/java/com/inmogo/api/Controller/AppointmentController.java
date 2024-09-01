package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Service.AppointmentService;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para gestionar visitas.
 * 
 * Proporciona endpoints para crear y manejar visitas en el sistema. Los servicios inyectados permiten la 
 * interacción con la lógica de visitas y la gestión de publicaciones.
 * 
 * Atributos:
 * - appointmentService: Servicio para gestionar la creación y administración de visitas.
 * - listingService: Servicio para gestionar la disponibilidad y otras operaciones relacionadas con las publicaciones.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private ListingService listingService;

    /**
     * Crea una nueva visita para un listado específico en un día y hora determinados.
     * 
     * Actualiza la disponibilidad del listado y luego crea una cita utilizando la información proporcionada en la solicitud.
     * 
     * @param appointmentRequest Datos de la visita, incluyendo ID del propietario, adquiriente, listado y fecha en formato Unix.
     * @param day El día de la visita especificado en la URL.
     * @param i La hora de la visita especificada en la URL.
     * @return La cita creada.
     */
    @PostMapping("/create/{day}/{i}")
    public Appointment appoint(@RequestBody AppointmentRequest appointmentRequest, @PathVariable int day, @PathVariable int i) {
        listingService.removeAvailabity(appointmentRequest.getListingId(), day, i);
        return appointmentService.appoint(
                appointmentRequest.getOwnerId(),
                appointmentRequest.getAcquirerId(),
                appointmentRequest.getListingId(),
                appointmentRequest.getUnixDate()
        );
    }
}

