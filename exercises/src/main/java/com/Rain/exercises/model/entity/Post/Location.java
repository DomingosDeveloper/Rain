package com.Rain.exercises.model.entity.Post;

import com.Rain.exercises.model.entity.Title;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Location {
    @JsonIgnoreProperties(ignoreUnknown = true)
    
    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("title")
    private Title title;

    @JsonProperty("parent")
    private int parente;
    
    @JsonProperty("map")
    private String map;
    
    public Location(Long id, Title title, int parente, String map) {
        this.id = id;
        this.title = title;
        this.parente = parente;
        this.map = map;
    }

    public Location() {
    }

    public Title getTitle() {
        return title;
    }

    public Long getId(){
        return id;
    }
    
    @Override
    public String toString() {
        return "Locations [title=" + title + "]";
    }


}