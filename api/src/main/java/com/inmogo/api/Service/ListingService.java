package com.inmogo.api.Service;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.Property;
import com.inmogo.api.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class ListingService {
    @Autowired
    private ListingRepository ListingRepository;
    public Listing post(
            String title,
            String description,
            String address,
            String image,
            ArrayList<String> visitingHours,
            int price,
            int squareMeters
    ) {
        Property property = new Property(title, address, "Santiago", "", "", new ArrayList<String>(), image, squareMeters);
        Listing listing = new Listing(title, LocalDate.now(), "", 0);

        return listing;
    }
}
