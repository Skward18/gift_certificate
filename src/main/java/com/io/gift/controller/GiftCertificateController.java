package com.io.gift.controller;

import com.io.gift.model.dto.GiftCertificateDto;
import com.io.gift.model.request.GiftCertificateCreateRequest;
import com.io.gift.service.GiftCertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/giftCertificate")
public class GiftCertificateController {

    private final GiftCertificateService giftCertificateService;

    @PostMapping
    public ResponseEntity<GiftCertificateDto> create(@RequestBody GiftCertificateCreateRequest giftCertificateCreateRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(giftCertificateService.create(giftCertificateCreateRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GiftCertificateDto> getOne(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(giftCertificateService.getOne(id));
    }
}
