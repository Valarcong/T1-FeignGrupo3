package pe.edu.cibertec.t1feigngrupo3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo3.restclient.swapi.iclient.SwapiClient;
import pe.edu.cibertec.t1feigngrupo3.restclient.swapi.model.StarWarsCharacter;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StarWarsService {
    private final SwapiClient swapiClient;

    public List<StarWarsCharacter> obtenerPersonajesFiltrados() {
        return swapiClient.obtenerPersonajes().getResults().stream()
                .filter(personaje -> "female".equals(personaje.getGender()))
                .filter(personaje -> alturaMayorA160(personaje.getHeight()))
                .collect(Collectors.toList());
    }

    private boolean alturaMayorA160(String height) {
        if (height == null) return false;
        try {
            return Integer.parseInt(height.trim()) > 160;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
