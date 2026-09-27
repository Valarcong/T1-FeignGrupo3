package com.cibertec.t1_feigngrupo1.restclient.brewery.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BreweryData {
    private String id;
    private String name;
    @JsonProperty("brewery_type")
    private String breweryType;
    private String state;
}
