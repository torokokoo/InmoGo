package com.inmogo.api.Service;

import com.inmogo.api.Entity.Acquirer;
import com.inmogo.api.Repository.AcquirerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio para la lógica de negocio relacionada con usuarios adquirientes (Acquirer).
 * 
 * Proporciona métodos para gestionar las operaciones de los adquirientes, como el registro de nuevos adquirientes.
 * Utiliza {@link AcquirerRepository} para realizar las operaciones en la base de datos.
 */

@Service

public class AcquirerService {
    @Autowired
    private AcquirerRepository acquirerRepo;

    /**
     * Registra un nuevo usuario adquiriente en el sistema.
     * Verifica si el adquiriente ya existe por su correo electrónico. Si no existe, lo guarda en la base de datos. 
     * Si alguien se registra en un inicio en el sistema, siempre sera un Adquiriente.
     * 
     * @param id ID del usuario adquiriente. 
     * @param name Nombre del usuario adquiriente.
     * @param rut RUT del usuario adquiriente.
     * @param email Correo electrónico del usuario adquiriente. 
     * @param password Contraseña del usuario adquiriente.
     * @return El adquiriente registrado si el correo no está en uso, de lo contrario, retorna null.
     */
    public Acquirer register(long id, String name, String rut, String email, String password){
        Acquirer newAcquirer = new Acquirer(id, name, rut, email, password);
        Acquirer exists = acquirerRepo.findByEmail(newAcquirer.getEmail());
        System.out.println("Register");
        if (exists != null){
            return null;
        }
        return acquirerRepo.save(newAcquirer);
    }
}
