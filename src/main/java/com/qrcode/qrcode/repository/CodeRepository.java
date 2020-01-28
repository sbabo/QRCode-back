package com.qrcode.qrcode.repository;

import com.qrcode.qrcode.bo.Code;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepository extends JpaRepository<Code, Long> {
}
