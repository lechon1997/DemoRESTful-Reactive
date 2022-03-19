package com.example.DemoRESTful.Reactive.dto;

public class DtoWidget {

    private String id;
    private String name;
    private String description;
    private Integer version;

    public DtoWidget() {
    }

    public DtoWidget(String id, String name, String description, Integer version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
