package com.qrcode.qrcode.controllers;

import com.qrcode.qrcode.Exceptions.QRCodeNotFoundException;
import com.qrcode.qrcode.bo.Code;
import com.qrcode.qrcode.bo.QRCode;
import com.qrcode.qrcode.repository.CodeRepository;
import com.qrcode.qrcode.repository.QRCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class QRCodeController {

    @Autowired
    QRCodeRepository qrCodeRepository;

    @GetMapping("/qrCodes")
    public List<QRCode> getAllQRCodes() {
        return qrCodeRepository.findAll();
    }

    @GetMapping("/qrCodes/{id}")
    public QRCode getQRCodeById(@PathVariable(value = "id") Long id) throws QRCodeNotFoundException {
        return qrCodeRepository.findById(id)
                .orElseThrow(() -> new QRCodeNotFoundException(id));
    }

    @PostMapping("/qrCodes")
    public QRCode createQRCode(@Valid @RequestBody QRCode qrCode) { return qrCodeRepository.save(qrCode); }

    @PutMapping("/{id}")
    public QRCode updateQRCode(@PathVariable(value = "id") Long id, @Valid @RequestBody QRCode qrCodeDetails) throws QRCodeNotFoundException {
        QRCode qrCode = qrCodeRepository.findById(id).orElseThrow(() -> new QRCodeNotFoundException(id));

        qrCode.setQRCode(qrCodeDetails.getQRCode());
        qrCode.setUrl(qrCodeDetails.getUrl());

        QRCode updatedQRCode = qrCodeRepository.save(qrCode);
        return updatedQRCode;
    }

    @DeleteMapping("/qrCodes/{id}")
    public ResponseEntity deleteQRCode(@PathVariable(value = "id") Long id) throws QRCodeNotFoundException {
        QRCode qrCode = qrCodeRepository.findById(id).orElseThrow(() -> new QRCodeNotFoundException(id));
        qrCodeRepository.delete(qrCode);
        return ResponseEntity.ok().build();
    }
}
