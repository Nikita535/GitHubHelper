package com.example.githelper;

import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GHRepository;

import java.util.List;

public class Repository {
    private String name;
    private GHRepository ghRepository;
    private List<GHPullRequest> prs;

    public Repository(String name, GHRepository ghRepository, List<GHPullRequest> prs) {
        this.name = name;
        this.ghRepository = ghRepository;
        this.prs = prs;
    }

    public String getName() {
        return name;
    }

    public GHRepository getGhRepository() {
        return ghRepository;
    }

    public List<GHPullRequest> getPrs() {
        return prs;
    }
}
