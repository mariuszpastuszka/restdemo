package pl.sda.restdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.sda.restdemo.dto.GithubRepo;

import java.util.List;

@RestController
@RequestMapping("/github")
public class GithubController {

    private static final Logger logger = LoggerFactory.getLogger(GithubController.class);
    private final RestTemplate restTemplate;

    public GithubController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // /my-repos?user=michal
    @GetMapping("/my-repos")
    public String myReposAsString(@RequestParam("user") String gitHubUser) {
        logger.info("querying repos of user: [{}]", gitHubUser);

        return restTemplate.getForObject("https://api.github.com/users/{githubuser}/repos", String.class, gitHubUser);
    }

    @GetMapping("/my-repos-my-json")
    public GithubRepo[] myRepos(@RequestParam("user") String githubUser) {
        logger.info("querying repos with custom dto object for user [{}]", githubUser);

//        List<String> strings;
//        List<Object> objects;
        return restTemplate.getForObject("https://api.github.com/users/{githubuser}/repos", GithubRepo[].class, githubUser);
    }
}
