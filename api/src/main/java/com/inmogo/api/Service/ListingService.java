package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Repository.ListingRepository;
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

    public Listing post(boolean sale, boolean house, String title, ArrayList<String> images, String description, String dimensions, String address, String district, String sectorDescription, int price, ArrayList<ArrayList<Boolean>> reservations) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime()); //Se crea la fecha de publicacion
        Timestamp expired = new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000); //Se crea la fecha de expiracion

        Listing newPublish = new Listing(0, publishDate, expired, sale, house, title, images, description, dimensions, address, district, sectorDescription, price, reservations);
        return listingRepo.save(newPublish);
    }

    public List<Listing> getAll() {
        return listingRepo.findAll();
    }

    public Optional<Listing> getById(long id) {
        return listingRepo.findById(id);
    }
}
