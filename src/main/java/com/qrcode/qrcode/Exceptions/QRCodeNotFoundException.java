package com.qrcode.qrcode.Exceptions;

public class QRCodeNotFoundException extends Exception {
    private long id;

    public QRCodeNotFoundException(long id) {
        super(String.format("QRCode is not found with id : '%s'", id));
    }
}
