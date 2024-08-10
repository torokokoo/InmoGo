package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
}
