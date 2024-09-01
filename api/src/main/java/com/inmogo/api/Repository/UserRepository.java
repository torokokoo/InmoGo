package com.inmogo.api.Repository;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para gestionar operaciones CRUD de usuarios (UserTemplate).
 * 
 * Extiende {@link JpaRepository} para proporcionar acceso a la base de datos para la entidad {@link UserTemplate}.
 * Incluye métodos para buscar usuarios por ID, correo electrónico o RUT.
 */

@Repository
public interface UserRepository extends JpaRepository<UserTemplate, Long> {
    
    /**
     * Busca un usuario por su ID.
     * 
     * @param id El ID del usuario a encontrar.
     * @return El usuario encontrado con el ID especificado.
     * 	
     */
    UserTemplate findUserById(Long id);

    /**
     * Busca un usuario mediante su correo electrónico.
     * 
     * @param email El correo electrónico del usuario a encontrar.
     * @return El usuario encontrado con el correo electrónico especificado.
     */
    UserTemplate findUserByEmail(String email);

    /**
     * Busca un usuario por su RUT.
     * 
     * @param rut El RUT del usuario a encontrar.
     * @return El usuario encontrado con el RUT especificado. 
     */
    UserTemplate findUserByRut(String rut);
}
