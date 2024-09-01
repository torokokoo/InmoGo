package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/listing")

public class ListingController {

    @Autowired
    private ListingService listingService;

    @PostMapping("/createListing")
    public Listing createListing(@RequestBody Listing newListing) {
        System.out.println("Creando publicacion...");
        return listingService.createListing(newListing);
    }

    @GetMapping("/getAllListings")
    public List<Listing> getAllListings() {
        System.out.println("Consiguiendo todas las publicaciones...");
        return listingService.getAllListings();
    }

    @GetMapping("/{id}")
    public Listing findById(@PathVariable Long id) {
        System.out.println("Buscando propiedad por ID...");
        return listingService.findById(id);
    }
}
