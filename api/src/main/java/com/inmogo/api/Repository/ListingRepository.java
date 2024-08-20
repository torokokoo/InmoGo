package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.introspector.Property;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}

