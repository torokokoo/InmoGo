package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.Owner;
import com.inmogo.api.Repository.ListingRepository;
import com.inmogo.api.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepo;

    @Autowired
    private OwnerRepository ownerRepo;

    public Listing post(Long ownerId, boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime()); // Se crea la fecha de publicación
        Timestamp expired = new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000); // Se crea la fecha de expiración

        // Buscar el Owner por ID
        Optional<Owner> ownerOpt = ownerRepo.findById(ownerId);
        if (!ownerOpt.isPresent()) {
            throw new RuntimeException("Owner not found");
        }
        Owner owner = ownerOpt.get();

        Listing newPublish = new Listing(0, publishDate, expired, sale, house, title, images, description, dimensions, address, district, sectorDescription, price, reservations);
        newPublish.setOwnerID(owner); // Asignar el Owner al Listing
        return listingRepo.save(newPublish);
    }

    public List<Listing> getAll() {
        return listingRepo.findAll();
    }

    public Optional<Listing> getById(long id) {
        return listingRepo.findById(id);
    }
}

