package com.devsuperior.dslearnbds.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tb_course")
public class Course implements Serializable {
    public static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    public Course(){};

    public Course(Long id, String name, String imgUri, String imgGrayUri) {
        Id = id;
        this.name = name;
        this.imgUri = imgUri;
        this.imgGrayUri = imgGrayUri;
    }

    @OneToMany(mappedBy = "course")
    private List<Offer> offer= new ArrayList<>();

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getImgGrayUri() {
        return imgGrayUri;
    }

    public void setImgGrayUri(String imgGrayUri) {
        this.imgGrayUri = imgGrayUri;
    }

    public List<Offer> getOffer() {
        return offer;
    }
}
