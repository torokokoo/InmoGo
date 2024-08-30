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

    public Appointment appoint(Long ownerId, Long acquirerId, Long listingId, int dayOfAppointment, int timeOfAppointment) {
        // Buscar el UserTemplate por ID
        UserTemplate owner = userRepo.findById(ownerId).orElseThrow(() -> new RuntimeException("Owner not found"));
        UserTemplate acquirer = userRepo.findById(acquirerId).orElseThrow(() -> new RuntimeException("Acquirer not found"));
        Listing listing = listingRepo.findById(listingId).orElseThrow(() -> new RuntimeException("Listing not found"));

        Appointment newAppoint = new Appointment(owner, acquirer, listing, dayOfAppointment, timeOfAppointment);
        return appRepo.save(newAppoint);
    }
}

