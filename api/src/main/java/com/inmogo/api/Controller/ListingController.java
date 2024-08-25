package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/listing")

public class ListingController {

    @Autowired
    private ListingService listingService;
    @PostMapping("/create")
    public Listing post(@RequestBody Listing newListing) {
        System.out.printf("Creando publicacion");
        return listingService.post(newListing.getTitle(), newListing.getAddress(), newListing.getDistrict(), newListing.getDescription(), newListing.getSectorDescription(), newListing.getImages(), newListing.getDimensions(), newListing.getPrice());
    }
}
