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

    public Listing post(String title, String address, String district, String description, String sectorDescription, ArrayList<String> images, String dimensions, int price, ArrayList<ArrayList<Boolean>> reservations, boolean house, boolean sale) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime());
        Timestamp expired = new Timestamp(System.currentTimeMillis() + 30L * 24 * 60 * 60 * 1000);

        Listing newPublish = new Listing(title, address, district, description, sectorDescription, images, dimensions, publishDate, 0, price, reservations, house, sale, expired);
        return listingRepo.save(newPublish);
    }
}
