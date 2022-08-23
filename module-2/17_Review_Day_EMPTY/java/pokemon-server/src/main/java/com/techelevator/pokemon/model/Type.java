package com.techelevator.pokemon.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Type {
    private int id;
    @JsonProperty("name")
    private String typeName;

    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
