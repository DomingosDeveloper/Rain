package com.Rain.exercises.model.entity.Post;

import java.util.List;

import com.Rain.exercises.model.entity.Author.Author;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class People {

    @JsonProperty("people")
    private List<Author> author;

    public People(List<Author> author) {
        this.author = author;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People [author=" + author + "]";
    }

    public List<Author> getAuthor() {
        return author;
    }
    
}
