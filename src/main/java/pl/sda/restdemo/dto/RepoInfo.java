package pl.sda.restdemo.dto;

public class RepoInfo {
    private String login;
    private String url;

    public RepoInfo() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
