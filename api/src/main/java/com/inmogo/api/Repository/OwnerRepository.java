package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para gestionar operaciones CRUD de propietarios (Owners).
 * 
 * Extiende {@link JpaRepository} para proporcionar acceso a la base de datos para la entidad {@link Owner}.
 * Incluye métodos predefinidos para realizar operaciones básicas como guardar, actualizar, eliminar y buscar propietarios.
 */

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>  {
}
