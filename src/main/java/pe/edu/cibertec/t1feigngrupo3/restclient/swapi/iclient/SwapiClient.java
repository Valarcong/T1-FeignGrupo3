package pe.edu.cibertec.t1feigngrupo3.restclient.swapi.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo3.restclient.swapi.model.StarWarsResponse;

@FeignClient(name = "swapiClient", url = "https://swapi.dev")
public interface SwapiClient {

    @GetMapping(value = "/api/people/?format=json", headers = "Accept=application/json")
    StarWarsResponse obtenerPersonajes();
}
