package com.qrcode.qrcode.controllers;

import com.qrcode.qrcode.Exceptions.CodeNotFoundException;
import com.qrcode.qrcode.bo.Code;
import com.qrcode.qrcode.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/api/code")
public class CodeController {

    @Autowired
    CodeRepository codeRepository;

    @GetMapping("/codes")
    public List<Code> getAllCodes() {
        return codeRepository.findAll();
    }

    @GetMapping("/codes/{id}")
    public Code getCodeById(@PathVariable(value = "id") Long id) throws CodeNotFoundException {
        return codeRepository.findById(id)
                .orElseThrow(() -> new CodeNotFoundException(id));
    }

    @PostMapping("/codes")
    public Code createCode(@Valid @RequestBody Code code) { return codeRepository.save(code); }

    @PutMapping("/{id}")
    public Code updateCode(@PathVariable(value = "id") Long id, @Valid @RequestBody Code codeDetails) throws CodeNotFoundException {
        Code code = codeRepository.findById(id).orElseThrow(() -> new CodeNotFoundException(id));

        code.setCode(codeDetails.getCode());
        code.setDescription(codeDetails.getDescription());

        Code updatedBook = codeRepository.save(code);
        return updatedBook;
    }

    @DeleteMapping("/codes/{id}")
    public ResponseEntity deleteCode(@PathVariable(value = "id") Long id) throws CodeNotFoundException {
        Code code = codeRepository.findById(id).orElseThrow(() -> new CodeNotFoundException(id));
        codeRepository.delete(code);
        return ResponseEntity.ok().build();
    }
}
