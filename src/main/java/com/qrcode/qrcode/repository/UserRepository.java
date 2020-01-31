package com.qrcode.qrcode.repository;

import com.qrcode.qrcode.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
