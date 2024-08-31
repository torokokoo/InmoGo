package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/listing")
public class ListingController {

    @Autowired
    private ListingService listingService;

    @PostMapping("/create")
    public Listing post(@RequestBody ListingRequest listingRequest) {
        System.out.println("Creando publicacion");
        return listingService.post(newListing.getSale(), newListing.getHouse(), newListing.getTitle(), newListing.getImages(), newListing.getDescription(), newListing.getDimensions(), newListing.getAddress(), newListing.getDistrict(), newListing.getSectorDescription(), newListing.getPrice(), newListing.getReservations(), newListing.getOwnerId());
    }

    @GetMapping("/all")
    public List<Listing> getAll() {
        System.out.printf("Consiguiendo todas las publicaciones");
        return listingService.getAll();
    }

    @GetMapping("/id")
    public Optional<Listing> getById(@PathVariable long id) {
        System.out.printf("Buscando propiedad por id");
        return listingService.getById(id);
    }
}
