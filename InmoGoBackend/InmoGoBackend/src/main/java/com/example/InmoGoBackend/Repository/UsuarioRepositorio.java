package com.example.InmoGoBackend.Repository;

import com.example.InmoGoBackend.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
}
