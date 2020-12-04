package pl.sda.restdemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubRepo {
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    private RepoInfo owner;

    public GithubRepo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public RepoInfo getOwner() {
        return owner;
    }

    public void setOwner(RepoInfo owner) {
        this.owner = owner;
    }
}
