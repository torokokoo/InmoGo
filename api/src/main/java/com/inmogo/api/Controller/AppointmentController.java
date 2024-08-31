package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Service.AppointmentService;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private ListingService listingService;

    @PostMapping("/create/{day}/{i}")
    public Appointment appoint(@RequestBody AppointmentRequest appointmentRequest, @PathVariable int day, @PathVariable int i) {
        listingService.removeAvailabity(appointmentRequest.getListingId(), day, i);
        return appointmentService.appoint(
                appointmentRequest.getOwnerId(),
                appointmentRequest.getAcquirerId(),
                appointmentRequest.getListingId(),
                appointmentRequest.getUnixDate()
        );
    }
}

