package com.Rain.exercises.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Title {
    @JsonProperty("pt-br")
    private String title;

    public Title() {
    }

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title [title=" + title + ", hashCode()=" + hashCode() + "]";
    }
}
