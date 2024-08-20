package com.inmogo.api.Repository;

import com.inmogo.api.Entity.UserOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<UserOwner, Long>  {
}
