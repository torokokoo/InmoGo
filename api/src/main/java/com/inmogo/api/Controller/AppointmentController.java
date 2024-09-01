package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Service.AppointmentService;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private ListingService listingService;

    @PostMapping("/createAppointment/{day}/{timeOfDay}")
    public Appointment createAppointment(@RequestBody Appointment newAppointment,@PathVariable int day, @PathVariable int timeOfDay){
        listingService.removeAvailabity(newAppointment.getListingId(), day, timeOfDay);
        return appointmentService.createAppointment(newAppointment);
    }
}
