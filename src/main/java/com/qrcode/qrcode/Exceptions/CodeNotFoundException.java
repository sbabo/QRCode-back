package com.qrcode.qrcode.Exceptions;

public class CodeNotFoundException extends Exception {
    private long id;

    public CodeNotFoundException(long id) {
        super(String.format("Code is not found with id: '%s'", id));
    }
}
