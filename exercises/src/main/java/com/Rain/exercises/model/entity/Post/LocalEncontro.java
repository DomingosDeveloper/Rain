package com.Rain.exercises.model.entity.Post;

import com.Rain.exercises.model.entity.Title;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class LocalEncontro extends Post{
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Title title;

    public LocalEncontro() {
    }

    @Override
    public String toString() {
        return "LocalEncontro [title=" + title + "]";
    }

    public LocalEncontro(Title title) {
        this.title = title;
    }

    public Title getTitle() {
        return title;
    }
}