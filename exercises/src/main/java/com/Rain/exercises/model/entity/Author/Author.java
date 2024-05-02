package com.Rain.exercises.model.entity.Author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Author {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("")
    private String name;
    private String institucion;
    private Bio bio;
    private String picture;
    private Role role;
    
    public Author() {
    }
    public Author(Long id, String name, String institucion, Bio bio, String picture, Role role) {
        this.id = id;
        this.name = name;
        this.institucion = institucion;
        this.bio = bio;
        this.picture = picture;
        this.role = role;
    }
    
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getInstitucion() {
        return institucion;
    }
    public Bio getBio() {
        return bio;
    }
    public String getPicture() {
        return picture;
    }
    public Role getRole() {
        return role;
    }

    
}
