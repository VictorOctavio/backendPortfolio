package com.ogbackend.og.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private LocalDate fecha ;
    private String tecnologies;
    private String imageURL;
    private String url;


    public Project(Integer id, String name, String description, LocalDate fecha, String tecnologies, String imageURL, String url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fecha = fecha;
        this.tecnologies = tecnologies;
        this.imageURL = imageURL;
        this.url = url;
    }

    public Project(String name, String description, LocalDate fecha, String tecnologies, String imageURL, String url) {
        this.name = name;
        this.description = description;
        this.fecha = fecha;
        this.tecnologies = tecnologies;
        this.imageURL = imageURL;
        this.url = url;
    }

    public Project() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTecnologies() {
        return tecnologies;
    }

    public void setTecnologies(String tecnologies) {
        this.tecnologies = tecnologies;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
