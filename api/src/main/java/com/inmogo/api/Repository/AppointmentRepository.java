package com.inmogo.api.Repository;

import com.inmogo.api.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    Appointment findByListingIdAndDate(long listingId, Timestamp date);
}
