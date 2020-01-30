package com.qrcode.qrcode.repository;

import com.qrcode.qrcode.bo.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


public interface CodeRepository extends JpaRepository<Code, Long> {

    @RestResource(path="by-code")
    Code findByCode(@Param("data") String code);
}
