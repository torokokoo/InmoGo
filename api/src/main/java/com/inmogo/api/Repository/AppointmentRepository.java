package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.UserTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para gestionar operaciones CRUD de visitas (Appointments).
 * 
 * Extiende {@link JpaRepository} para proporcionar acceso a la base de datos para la entidad {@link Appointment}.
 * Incluye métodos adicionales para buscar visitas por ID de publicación y fecha Unix.
 */
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    /**
     * Busca una visita agendada por el ID de la publicación.
     * 
     * @param listingId ID de la publicación asociada a la visita agendada.
     * @return La visita correspondiente al ID de la publicación proporcionada.
     */
    Appointment findByListingId(Listing listingId);

    /**
     * Busca una visitas agendadas por el ID de la publicación y la fecha Unix.
     * 
     * @param listingId La publicación asociada a la visita agendada.
     * @param unixDate La fecha Unix de la visita agendada
     * @return La visita agendada correspondiente al ID de la publicación y la fecha Unix proporcionadas.
     */
    Appointment findByListingIdAndUnixDate(Listing listingId, long unixDate);
}

