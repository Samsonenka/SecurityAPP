package com.samsonenka.SecurityDB.repo;

import com.samsonenka.SecurityDB.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}
