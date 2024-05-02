package com.Rain.exercises.model.entity.Post;

import com.Rain.exercises.model.entity.Title;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Embedded;

public class Categoria {
    @JsonIgnoreProperties(ignoreUnknown = true)

    @JsonProperty("id")
    long id;

    @JsonProperty("title")
    @Embedded
    Title title;

    @JsonProperty("color")
    String cor;

    @JsonProperty("background-color")
    String corDeFundo;
    
    public Categoria() {
    }

    public Title getTitle() {
        return title;
    }
    
    public String getCor() {
        return cor;
    }
    
    public String getCorDeFundo() {
        return corDeFundo;
    }
    public Categoria(long id, Title title, String cor, String corDeFundo) {
        this.id = id;
        this.title = title;
        this.cor = cor;
        this.corDeFundo = corDeFundo;
    }

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", title=" + title + ", cor=" + cor + ", corDeFundo=" + corDeFundo + "]";
    }
}
