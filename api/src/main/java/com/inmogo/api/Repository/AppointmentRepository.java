package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Appointment;
import com.inmogo.api.Entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Appointment findByListingId(Listing listingId);
    Appointment findByListingIdAndUnixDate(Listing listingId, long unixDate);
}

