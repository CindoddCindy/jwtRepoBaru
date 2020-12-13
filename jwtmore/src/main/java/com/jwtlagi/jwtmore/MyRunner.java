package com.jwtlagi.jwtmore;

import com.jwtlagi.jwtmore.model.Role;
import com.jwtlagi.jwtmore.model.RoleName;
import com.jwtlagi.jwtmore.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    private final RoleRepository roleRepository;

    public MyRunner(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        roleRepository.save(new Role(RoleName.ROLE_ADMIN));
        roleRepository.save(new Role(RoleName.ROLE_BUYER));
        roleRepository.save(new Role(RoleName.ROLE_SELLER));
    }
}
