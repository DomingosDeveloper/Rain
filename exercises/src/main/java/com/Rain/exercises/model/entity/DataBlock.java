package com.Rain.exercises.model.entity;

import java.util.List;

import com.Rain.exercises.model.entity.Post.Post;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class DataBlock {
    @JsonIgnoreProperties(ignoreUnknown = true)
    
    public List<Post> getPost() {
        return post;
    }
    
    @Embedded
    private List<Post> post;

    public DataBlock() {
    }


    public void setPost(List<Post> post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "DataBlock [post=" + post + "]";
    }

    
}
