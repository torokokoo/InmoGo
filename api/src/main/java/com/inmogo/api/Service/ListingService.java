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

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepo;

    @Autowired
    private UserRepository ownerRepo;

    public Listing post(boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations, long ownerId) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime());
        Timestamp expired = new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000);

        // Buscar el UserTemplate por ID
        UserTemplate owner = ownerRepo.findById(ownerId).orElseThrow(() -> new RuntimeException("UserTemplate not found"));

        Listing newPublish = new Listing(0, publishDate, expired, sale, house, title, images, description, dimensions, address, district, sectorDescription, price, reservations, owner);
        return listingRepo.save(newPublish);
    }

    public List<Listing> getAll() {
        return listingRepo.findAll();
    }

    public Optional<Listing> getById(long id) {
        return listingRepo.findById(id);
    }

    public Listing removeAvailabity(long listingId, int day, int i) {
        Listing foundListing = listingRepo.findById(listingId).orElseThrow(() -> new RuntimeException("Listing not found"));

        ArrayList<ArrayList<Boolean>> oldReservations = foundListing.getReservations();
        oldReservations.get(day - 1).set(i, false);
        foundListing.setReservations(oldReservations);
        return listingRepo.save(foundListing);
    }
}

