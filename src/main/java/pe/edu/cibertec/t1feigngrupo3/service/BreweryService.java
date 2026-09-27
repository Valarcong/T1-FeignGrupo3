package pe.edu.cibertec.t1feigngrupo3.service;

import pe.edu.cibertec.t1feigngrupo3.restclient.brewery.iclient.BreweryClient;
import pe.edu.cibertec.t1feigngrupo3.restclient.brewery.model.BreweryData;
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
