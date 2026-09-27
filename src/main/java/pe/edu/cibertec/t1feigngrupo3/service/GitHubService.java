package pe.edu.cibertec.t1feigngrupo3.service;

import pe.edu.cibertec.t1feigngrupo3.client.GitHubClient;
import pe.edu.cibertec.t1feigngrupo3.dto.GitHubUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GitHubService {

    private final GitHubClient gitHubClient;

    public List<GitHubUserDto> getFilteredUsers() {
        return gitHubClient.getUsers().stream()
                .filter(u -> u.getLogin() != null && u.getLogin().length() <= 5)
                .filter(u -> Boolean.FALSE.equals(u.getSite_admin()))
                .collect(Collectors.toList());
    }
}