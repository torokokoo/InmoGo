package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Acquirer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para gestionar operaciones CRUD de adquirientes (Acquirers).
 * 
 * Extiende {@link JpaRepository} para proporcionar acceso a la base de datos para la entidad {@link Acquirer}.
 * Ofrece un método adicional para buscar adquirientes por su correo electrónico.
 */

public interface AcquirerRepository extends JpaRepository<Acquirer, Long> {

    /**
     * Busca un adquiriente por su dirección de correo electrónico. 
     * 
     * @param email La dirección de correo electrónico del adquiriente.
     * @return El adquiriente asociado al correo electrónico proporcionado.
     */
    Acquirer findByEmail(String email);
}

