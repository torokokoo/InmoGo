package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/create")
    public Appointment appoint(@RequestBody AppointmentRequest appointmentRequest) {
        return appointmentService.appoint(
                appointmentRequest.getOwnerId(),
                appointmentRequest.getAcquirerId(),
                appointmentRequest.getListingId(),
                appointmentRequest.getDayOfAppointment(),
                appointmentRequest.getTimeOfAppointment()
        );
    }
}

