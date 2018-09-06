package com.example.demo.guitar;

public class Guitar {

    private long id;

    private String name;

    private String type;

    private String strings;

    public Guitar() {
    }

    public Guitar(long id, String name, String type, String strings) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.strings = strings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrings() {
        return strings;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }
}
