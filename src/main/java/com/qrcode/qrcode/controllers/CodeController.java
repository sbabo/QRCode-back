package com.qrcode.qrcode.controllers;

import com.qrcode.qrcode.Exceptions.CodeNotFoundException;
import com.qrcode.qrcode.bo.Code;
import com.qrcode.qrcode.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.awt.print.Book;
import java.util.List;

@Validated
@RestController
@RequestMapping("/codes")
public class CodeController {

    private CodeRepository repository;
    @GetMapping
    public ResponseEntity<List<Code>> findAll(
            @Valid @Positive @RequestParam(required = false, defaultValue = "1") int page,
            @Valid @Positive @RequestParam(required = false, defaultValue = "10") int size) {
        HttpHeaders headers = new HttpHeaders();
        Page<Code> codes = repository.findAll(PageRequest.of(page, size));
        headers.add("X-Users-Total", Long.toString(codes.getTotalElements()));
        return new ResponseEntity<>(codes.getContent(), headers, HttpStatus.OK);
    }
}