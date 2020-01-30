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

