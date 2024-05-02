package com.Rain.exercises.model.entity.Author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Role {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String cargo;

    public Role() {
    }

    public Role(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Role [cargo=" + cargo + "]";
    }
}
