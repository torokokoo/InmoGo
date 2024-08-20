package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing,Long> {
    Listing findByEmail(String email);
}
