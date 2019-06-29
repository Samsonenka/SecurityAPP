package com.samsonenka.SecurityDB.repo;

import com.samsonenka.SecurityDB.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepo extends JpaRepository<Role, Integer> {

    Role findByRole(String role);
}
