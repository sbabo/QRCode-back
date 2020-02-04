package com.qrcode.qrcode.repository;

import com.qrcode.qrcode.bo.ERole;
import com.qrcode.qrcode.bo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
