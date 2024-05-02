package com.Rain.exercises.model.entity;


import java.util.List;

import com.Rain.exercises.model.entity.Post.Post;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntireBody {
    
    @Override
    public String toString() {
        return "EntireBody [posts=" + posts + "]";
    }

    @JsonProperty("count")
    private int count;
    
    @JsonProperty("links")
    private Link link;
    
    @JsonProperty("data")
    private List<Post> posts;
    
    public EntireBody() {
    }

    public EntireBody(int count, Link link, List<Post> posts) {
        this.count = count;
        this.link = link;
        this.posts = posts;
    }

    public EntireBody(List<Post> posts) {
        this.posts = posts;
    }

    public int getCount() {
        return count;
    }

    public Link getLink() {
        return link;
    }

    public List<Post> getPosts() {
        return posts;
    }

  

    



   
}  

