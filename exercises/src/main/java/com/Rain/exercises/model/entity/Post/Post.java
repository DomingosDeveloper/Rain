package com.Rain.exercises.model.entity.Post;
import java.util.List;

import com.Rain.exercises.model.entity.Title;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Post  {
    
    @JsonProperty("id")
    private long id;
    
    @JsonProperty("changed")
    private int changed;

    @JsonProperty("start")
    private String startTime;

    @JsonProperty("end")
    private String endTime;
    
    @JsonProperty("title")
    private Title title;
    
    @JsonProperty("description")
    private Descricao descricao;

    @JsonProperty("category")
    private Categoria categoria;
    
    @JsonProperty("locations")
    @JsonDeserialize(contentAs = Location.class)
    private List<Location> locations;
    
    @JsonProperty("type")
    private LocalEncontro local;

    @JsonProperty("people")
    @JsonDeserialize(contentAs = People.class)
    private List<People> authors;

    public Post() {
    }
  
    public Title getTitle() {
        return title;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public List<Location> getLocations() {
        return locations;
    }
    public List<People> getAuthor(){
        return authors;
    }
    
    public String getDiaInicioSubString() {
        if (this.startTime == null) {
            return "";
        }
        return this.startTime.substring(7, 9);
    }

    @Override
    public String toString() {
        return "Post [id=" + id + ", changed=" + changed + ", startTime=" + startTime + ", endTime=" + endTime
                + ", title=" + title + ", descricao=" + descricao + ", categoria=" + categoria + ", location="
                + locations + ", local=" + local + ", authors=" + authors + "]";
    }

    public long getId() {
        return id;
    }

    public int getChanged() {
        return changed;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Descricao getDescricao() {
        return descricao;
    }

    public LocalEncontro getLocal() {
        return local;
    }

    public List<People> getAuthors() {
        return authors;
    }
    
}
