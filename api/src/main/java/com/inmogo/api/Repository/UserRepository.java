package com.inmogo.api.Repository;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserTemplate, Long> {
    Optional<UserTemplate> findUserById(Long id);
    Optional<UserTemplate> findUserByEmail(String email);
    Optional<UserTemplate> findUserByRut(String rut);
}