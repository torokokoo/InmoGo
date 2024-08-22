package com.inmogo.api.Service;

import com.inmogo.api.Entity.Acquirer;
import com.inmogo.api.Repository.AcquirerRepository;
import com.inmogo.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

//Se crea la logica de negocio para el adquiriente
public class AcquirerService {
    @Autowired
    private AcquirerRepository acquirerRepo;

    //Si alguien se registra en un inicio siempre sera un Adquiriente
    public Acquirer register(long id, String name, String rut, String email, String password){
        Acquirer newAcquirer = new Acquirer(id, name, rut, email, password);//Creamos un nuevo adquiriente
        Acquirer exists = acquirerRepo.findByEmail(newAcquirer.getEmail());
        System.out.println("Register");
        if (exists != null){
            return null;
        }
        return acquirerRepo.save(newAcquirer);
    }
}
