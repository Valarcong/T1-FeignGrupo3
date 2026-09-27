package pe.edu.cibertec.t1feigngrupo3.dto;

import lombok.Data;

@Data
public class GitHubUserDto {
    private Long id;
    private String login;
    private Boolean site_admin;
    private String avatar_url;
}