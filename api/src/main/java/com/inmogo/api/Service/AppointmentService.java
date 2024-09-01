package com.inmogo.api.Service;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Repository.AppointmentRepository;
import com.inmogo.api.Repository.ListingRepository;
import com.inmogo.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio para la lógica de negocio relacionada con las visitas agendadas (Appointment).
 * 
 * Proporciona métodos para gestionar las operaciones relacionadas con las visitas agendadas, 
 * como la creación de nuevas visitas.
 * Utiliza {@link AppointmentRepository} para interactuar con la base de datos, {@link UserRepository} 
 * y {@link ListingRepository} para obtener los datos necesarios de usuarios y listados.
 */

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ListingRepository listingRepo;

    /**
     * Crea una nueva visita agendada en el sistema.
     * Verifica la existencia del propietario, adquiriente y listado asociados. Si todos son válidos y no existe
     * una visita agendada para el listado en la misma fecha, guarda la nueva visita en la base de datos.
     * 
     * @param ownerId ID del usuario propietario de la visita agendada.
     * @param acquirerId ID del usuario adquiriente de la visita agendada.
     * @param listingId El ID de la publicación asociada con la cita.
     * @param unixDate La fecha y hora de la visita en formato Unix Timestamp.
     * @return La visita creada si no existe una visita agendada previa en la misma fecha; de lo contrario, retorna null.
     */
    public Appointment appoint(Long ownerId, Long acquirerId, Long listingId, long unixDate) {

        UserTemplate owner = userRepo.findById(ownerId).orElseThrow(() -> new RuntimeException("Owner not found"));
        UserTemplate acquirer = userRepo.findById(acquirerId).orElseThrow(() -> new RuntimeException("Acquirer not found"));
        Listing listing = listingRepo.findById(listingId).orElseThrow(() -> new RuntimeException("Listing not found"));

        Appointment newAppoint = new Appointment(owner, acquirer, listing, unixDate);
        Appointment exists = appRepo.findByListingIdAndUnixDate(listing, unixDate);
        if (exists != null) {
            return null;
        }
        return appRepo.save(newAppoint);
    }
}

