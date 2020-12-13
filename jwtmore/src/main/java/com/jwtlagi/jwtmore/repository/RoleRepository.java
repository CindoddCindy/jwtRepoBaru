package com.jwtlagi.jwtmore.repository;

import com.jwtlagi.jwtmore.model.Role;
import com.jwtlagi.jwtmore.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);

}
