package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    Appointment findByListingId(long listingId);
    Appointment findByListingIdAndUnixDate(long listingId, long unixDate);
}
