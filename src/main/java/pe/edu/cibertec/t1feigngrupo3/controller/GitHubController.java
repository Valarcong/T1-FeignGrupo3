package pe.edu.cibertec.t1feigngrupo3.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo3.dto.GitHubUserDto;
import pe.edu.cibertec.t1feigngrupo3.service.GitHubService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/github")
public class GitHubController {

    private final GitHubService gitHubService;

    @GetMapping("/users")
    public List<GitHubUserDto> getFilteredUsers(){
        return gitHubService.getFilteredUsers();
    }
}
