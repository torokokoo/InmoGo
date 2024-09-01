package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para gestionar operaciones CRUD de publicaciones (Listings).
 * 
 * Extiende {@link JpaRepository} para proporcionar acceso a la base de datos para la entidad {@link Listing}.
 * Incluye métodos predefinidos para realizar operaciones básicas como guardar, actualizar, eliminar y buscar publicaciones.
 */

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
}
