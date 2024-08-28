package com.inmogo.api.Repository;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserTemplate, Long> {
    UserTemplate findUserById(Long id);
    UserTemplate findUserByEmail(String email);
    UserTemplate findUserByRut(String rut);
}