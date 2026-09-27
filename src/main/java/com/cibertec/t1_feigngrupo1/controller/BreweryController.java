package com.cibertec.t1_feigngrupo1.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.t1_feigngrupo1.restclient.brewery.model.BreweryData;
import com.cibertec.t1_feigngrupo1.service.BreweryService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/api/v1/brewery-client")
@RestController
@RequiredArgsConstructor
public class BreweryController {

    private final BreweryService breweryService;
    //localhost:8080/api/v1/brewery-client
    @GetMapping
    public ResponseEntity<List<BreweryData>> getBreweries() {
        return ResponseEntity.ok(breweryService.getBreweries());
    }
}
