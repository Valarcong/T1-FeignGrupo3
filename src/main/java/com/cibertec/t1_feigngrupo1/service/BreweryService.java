package com.cibertec.t1_feigngrupo1.service;

import com.cibertec.t1_feigngrupo1.restclient.brewery.iclient.BreweryClient;
import com.cibertec.t1_feigngrupo1.restclient.brewery.model.BreweryData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BreweryService {

    private final BreweryClient breweryClient;

    public List<BreweryData> getBreweries() {
        return breweryClient.getBreweries()
                .stream()
                .filter(b -> "micro".equals(b.getBreweryType())
                          && "California".equals(b.getState()))
                .toList();
    }
}
