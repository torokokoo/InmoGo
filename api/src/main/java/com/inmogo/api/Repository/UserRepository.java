package com.inmogo.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.inmogo.api.Entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
