package com.inmogo.api.Service;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AppointmentService {
    @Autowired
    private AppointmentRepository appRepo;

    public Appointment appoint(long ownerId, long acquirerId, long listingId, long unixDate){
        Appointment newAppoint = new Appointment(ownerId, acquirerId, listingId, unixDate);
        //Revisar si un Listing ya tiene un bloque reservado o no.
        //Retorna nulo si ya esta reservado
        //Agenda un nuevo agendado al caso contrario
        Appointment exists = appRepo.findByListingIdAndUnixDate(listingId, unixDate);
        System.out.println("Agendar:");
        if (exists != null){
            return null;
        }
        return appRepo.save(newAppoint);
    }
}
