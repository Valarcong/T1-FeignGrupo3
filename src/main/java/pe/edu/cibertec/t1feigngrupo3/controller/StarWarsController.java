package pe.edu.cibertec.t1feigngrupo3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo3.restclient.swapi.model.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo3.service.StarWarsService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/starwars")
public class StarWarsController {
    private final StarWarsService starWarsService;

    @GetMapping("/characters")
    public List<StarWarsCharacter> obtenerPersonajes() {
        return starWarsService.obtenerPersonajesFiltrados();
    }
}
