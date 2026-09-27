package pe.edu.cibertec.t1feigngrupo3.restclient.brewery.iclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cibertec.t1feigngrupo3.restclient.brewery.model.BreweryData;
import pe.edu.cibertec.t1feigngrupo3.restclient.config.FeignConfig;
@FeignClient(name = "brewery-client", 
url = "https://api.openbrewerydb.org")
public interface BreweryClient {

    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
