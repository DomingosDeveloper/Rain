package com.Rain.exercises.model.entity.Post;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Descricao extends Post{

    @JsonProperty("pt-br")
    private String ptbr;

    public Descricao(String ptbr) {
        this.ptbr = ptbr;
    }

    public Descricao() {
    }

    public String getPtbr() {
        return ptbr;
    }

    @Override
    public String toString() {
        return "Descricao [ptbr=" + ptbr + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Descricao other = (Descricao) obj;
        if (ptbr == null) {
            if (other.ptbr != null)
                return false;
        } else if (!ptbr.equals(other.ptbr))
            return false;
        return true;
    }
}
