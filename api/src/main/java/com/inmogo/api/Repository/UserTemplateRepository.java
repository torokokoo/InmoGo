package com.inmogo.api.Repository;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTemplateRepository extends JpaRepository<UserTemplate, Long> {
    UserTemplate findByEmail(String email);
    UserTemplate findByRut(String rut);
}