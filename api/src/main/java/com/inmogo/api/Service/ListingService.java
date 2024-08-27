package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepo;

    public Listing post(String title, String address, String district, String description, String sectorDescription, ArrayList<String> images, String dimensions, int price, ArrayList<ArrayList<Boolean>> reservations) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime());

        Listing newPublish = new Listing(title, address, district, description, sectorDescription, images, dimensions, publishDate, 0, price, reservations);
        return listingRepo.save(newPublish);
    }
}
