package com.inmogo.api.Service;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;

@Service

public class AppointmentService {
    @Autowired
    private AppointmentRepository appRepo;

    //Crea un agendado en base a datos nuevos, si es que no hay uno.
    public Appointment createAppointment(Long ownerId, Long acquirerId, Long listingId, Timestamp date){
        //Revisar si un Listing ya tiene un bloque reservado o no.
        //Retorna nulo si ya esta reservado
        //Agenda un nuevo agendado al caso contrario
        Appointment exists = appRepo.findByListingIdAndDate(listingId, date);
        System.out.println("Agendar:");
        if (exists != null){
            //Ya existe, por lo que hay que retornar null.
            return null;
        }
        //Si no existe, crear un nuevo agendado y guardar.
        return appRepo.save(new Appointment(ownerId,acquirerId,listingId,date));
    }

    //Crea un agendado en base a un agendado ya existente, si es que no hay uno.
    public Appointment createAppointment(Appointment appointment){
        Appointment exists = appRepo.findByListingIdAndDate(appointment.getListingId(),appointment.getDate());
        System.out.println("Agendar:");
        if (exists != null){
            return null;
        }
        return appRepo.save(new Appointment(appointment));
    }
}
