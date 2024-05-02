package com.Rain.exercises.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Link {
    @JsonProperty("self")
    private String self;
    @JsonProperty("next")
    private String next;
    
    public Link() {
    }

    public Link(String self, String next) {
        this.self = self;
        this.next = next;
    }

    public String getSelf() {
        return self;
    }

    public String getNext() {
        return next;
    }
    
}
