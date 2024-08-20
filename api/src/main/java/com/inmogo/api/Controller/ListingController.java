package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/Api/Listing")

public class ListingController {

    @Autowired
    private ListingService listingService;
    @PostMapping("/post")
    public Listing post(@RequestBody Listing newListing) {
        System.out.printf("Creando publicacion");
        return listingService.post(newListing.getTitle(), newListing.getNotesFromPropietary(), newListing.getRankingPos());
    }
}
