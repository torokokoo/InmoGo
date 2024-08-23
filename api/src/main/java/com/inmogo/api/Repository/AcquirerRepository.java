package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Acquirer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcquirerRepository extends JpaRepository<Acquirer, Long> {

    Acquirer findByEmail(String email);
}

