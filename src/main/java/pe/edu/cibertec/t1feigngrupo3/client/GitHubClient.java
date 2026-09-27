package pe.edu.cibertec.t1feigngrupo3.client;

import pe.edu.cibertec.t1feigngrupo3.dto.GitHubUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "gitHubClient", url = "https://api.github.com")
public interface GitHubClient {

    @GetMapping("/users")
    List<GitHubUserDto> getUsers();
}