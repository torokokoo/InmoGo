package com.inmogo.api.Service;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AppointmentService {
    @Autowired
    private AppointmentRepository appRepo;

    public Appointment appoint(int dayOfAppointment, int timeOfAppointment){
        Appointment newAppoint = new Appointment(dayOfAppointment, timeOfAppointment);
        return appRepo.save(newAppoint);
    }
}
