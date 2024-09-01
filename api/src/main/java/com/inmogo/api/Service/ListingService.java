package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Repository.ListingRepository;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepository;

    //Encuentra el Listing basandose en el ID de este.
    //Si no lo encuentra, lanzara un mensaje de error.
    public Listing findById(Long id){
        return listingRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Publicado con ID " + id + " no encontrado."));
    }

    //Crea una nueva publicacion en base a los atributos entregados.
    public Listing createListing(boolean saleOrRent,boolean houseOrApartment, int price, Long ownerId,
    String title, String description, String dimensions, String address, String district,
    String sectorDescription, ArrayList<String> images, ArrayList<ArrayList<Boolean>> reservations) {
        int rankingPos = 0;
        Timestamp publishDate = new Timestamp(System.currentTimeMillis());
        Timestamp expireDate = new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000);
        boolean isVerified = false;

        Listing newPublish = new Listing(rankingPos,publishDate, expireDate, isVerified, saleOrRent,
        houseOrApartment, price, ownerId, title, description, dimensions,
        address, district, sectorDescription, images, reservations);
        return listingRepository.save(newPublish);
    }

    //Crea una nueva publicacion en base a un listing pre-existente.
    public Listing createListing(Listing oldListing){
        if (oldListing == null) {
            throw new IllegalArgumentException("Listing pre-existente no puede ser nulo.");
        }
        Listing updatedOldListing = new Listing(oldListing);
        updatedOldListing.setPublishDate(new Timestamp(System.currentTimeMillis()));
        updatedOldListing.setExpireDate(new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000));
        updatedOldListing.setVerified(false);
        return listingRepository.save(updatedOldListing);
    }

    //Asigna el listing especificado como verificado.
    //Solo para staff.
    public Listing verifyListing(Long id){
        Listing listing = findById(id);
        listing.setVerified(true);
        return listingRepository.save(listing);
    }

    //Agrega 30 dias a la fecha de expiracion actual.
    //En el caso de haber expirado, agrega 30 dias en base al tiempo actual.
    public Listing extendExpireDateListing(Long id){
        Listing listing = findById(id);
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        Timestamp expireDate = listing.getExpireDate();
        //Dos casos:
        if (currentTime.before(expireDate)){
            //No expira, agregar 30 dias a expireDate
            listing.setExpireDate(new Timestamp(expireDate.getTime() + 30L * 24 * 60 * 60 * 1000));
            return listingRepository.save(listing);
        }else{
            //Si expira, asignar (tiempo actual + 30 dias) a expireDate
            listing.setExpireDate(new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 100));
            return listingRepository.save(listing);
        }
    }

    //Asigna una hora del dia como no disponible, en el caso de que se quiera reservar un bloque.
    public Listing removeAvailabity(Long listingId, int day, int timeOfDay) {
        //Buscar listing a modificar.
        Listing foundListing = listingRepository.findById(listingId)
        .orElseThrow(() -> new EntityNotFoundException("No se puede encontrar un publicado cuyo ID sea: " + listingId));
        //Obtener reservaciones.
        ArrayList<ArrayList<Boolean>> oldReservations = foundListing.getReservations();
        oldReservations.get(day - 1).set(timeOfDay, false);
        foundListing.setReservations(oldReservations);
        return listingRepository.save(foundListing);
    }

    //Retorna todos los listings del repositorio.
    //No se para que esta esto aqui pero bueno.
    public List<Listing> getAllListings() {
        return listingRepository.findAll();
    }
}
