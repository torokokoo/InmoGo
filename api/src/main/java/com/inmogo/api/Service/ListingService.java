package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Repository.ListingRepository;
import com.inmogo.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la lógica de negocio relacionada con las publicaciones (Listing).
 * 
 * Proporciona métodos para crear, obtener y modificar publicaciones. Utiliza {@link ListingRepository} 
 * para interactuar con la base de datos y {@link UserRepository} para obtener los datos del propietario de la publicación.
 */

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepo;

    @Autowired
    private UserRepository ownerRepo;

    /**
     * Crea una nueva publicación en el sistema.
     * Inicializa una publicación con la fecha actual como fecha de publicación y establece una fecha de expiración 
     * 30 días después. Asocia la publicación con el propietario correspondiente y guarda la publicación en la base de datos. 
     * 
     * @param sale Indica si la publicación es una venta o un arriendo.
     * @param house Indica si la publicación es una casa o un departamento.
     * @param title El título de la publicación.
     * @param images Una lista de URLs de imágenes asociadas con la publicación.
     * @param description La descripción de la publicación.
     * @param dimensions Las dimensiones de la propiedad.
     * @param address La dirección de la propiedad.
     * @param district La comuna donde se encuentra la propiedad.
     * @param sectorDescription Descripción del sector donde se encuentra la propiedad.
     * @param price El precio de la propiedad.
     * @param reservations La disponibilidad de hacer una visita agendada a la propiedad.
     * @param ownerId ID del usuario propietario que hizo la publicación.
     * @return La publicación creada y guardada en la base de datos.
     */
    public Listing post(boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations, long ownerId) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime());
        Timestamp expired = new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000);

        // Buscar el UserTemplate por ID
        UserTemplate owner = ownerRepo.findById(ownerId).orElseThrow(() -> new RuntimeException("UserTemplate not found"));

        Listing newPublish = new Listing(0, publishDate, expired, sale, house, title, images, description, dimensions, address, district, sectorDescription, price, reservations, owner);
        return listingRepo.save(newPublish);
    }

    /**
     * Obtiene una lista de las publicaciones del sistema.
     * 
     * @return Lista de las publicaciones hechas en el sistema
     */
    public List<Listing> getAll() {
        return listingRepo.findAll();
    }

    /**
     * Obtiene una publicación mediante su ID. 
     * 
     * @param id El ID proporcionado de una publicación.
     * @return Una publicación opcional, si existe.
     */
    public Optional<Listing> getById(long id) {
        return listingRepo.findById(id);
    }

    /**
     * Modifica la disponibilidad de una publicación.
     * 
     * Este método actualiza la disponibilidad de una propiedad específica en una fecha determinada.
     * Cambia el estado de disponibilidad en la lista de reservas, marcando el índice correspondiente 
     * dentro del día especificado como no disponible (false). Luego, guarda los cambios en la base de datos.
     * 
     * @param listingId ID de la publicación.
     * @param day El día para el cual se desea cambiar la disponibilidad.
     * @param i El índice dentro del día para modificar la disponibilidad.
     * @return La publicación actualizada con la disponibilidad modificada.
     */
    public Listing removeAvailabity(long listingId, int day, int i) {
        Listing foundListing = listingRepo.findById(listingId).orElseThrow(() -> new RuntimeException("Listing not found"));

        ArrayList<ArrayList<Boolean>> oldReservations = foundListing.getReservations();
        oldReservations.get(day - 1).set(i, false);
        foundListing.setReservations(oldReservations);
        return listingRepo.save(foundListing);
    }
}

