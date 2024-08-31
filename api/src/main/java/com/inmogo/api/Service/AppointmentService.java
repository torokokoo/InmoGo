package com.inmogo.api.Service;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Entity.UserTemplate;
import com.inmogo.api.Repository.AppointmentRepository;
import com.inmogo.api.Repository.ListingRepository;
import com.inmogo.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ListingRepository listingRepo;

    public Appointment appoint(Long ownerId, Long acquirerId, Long listingId, long unixDate) {

        UserTemplate owner = userRepo.findById(ownerId).orElseThrow(() -> new RuntimeException("Owner not found"));
        UserTemplate acquirer = userRepo.findById(acquirerId).orElseThrow(() -> new RuntimeException("Acquirer not found"));
        Listing listing = listingRepo.findById(listingId).orElseThrow(() -> new RuntimeException("Listing not found"));

        Appointment newAppoint = new Appointment(owner, acquirer, listing, unixDate);
        Appointment exists = appRepo.findByListingIdAndUnixDate(listing, unixDate);
        if (exists != null) {
            return null;
        }
        return appRepo.save(newAppoint);
    }
}

