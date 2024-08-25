package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class ListingService {
    @Autowired
    private ListingRepository listingRepo;

    public Listing post(String title, String notesFromPropietary, int rankingPos, int price, long propertyID) {
        Date time = new Date();
        Timestamp publishDate = new Timestamp(time.getTime());
        Listing newPublish = new Listing(title, publishDate, notesFromPropietary, rankingPos, price, propertyID);
        return listingRepo.save(newPublish);
    }
}
