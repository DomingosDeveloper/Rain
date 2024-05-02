package com.Rain.exercises.model.entity.Author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Embeddable;

@Embeddable
public class Bio {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String biografia;

    public Bio (String biografia){
        this.biografia = biografia;
    }

    public String getBio(){
        return biografia;
    }
}
