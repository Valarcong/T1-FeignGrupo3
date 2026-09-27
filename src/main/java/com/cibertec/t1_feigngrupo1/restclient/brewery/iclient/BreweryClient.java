package com.cibertec.t1_feigngrupo1.restclient.brewery.iclient;

import com.cibertec.t1_feigngrupo1.restclient.brewery.model.BreweryData;
import com.cibertec.t1_feigngrupo1.restclient.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "brewery-client", 
url = "https://api.openbrewerydb.org", 
configuration = FeignConfig.class)
public interface BreweryClient {

    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
