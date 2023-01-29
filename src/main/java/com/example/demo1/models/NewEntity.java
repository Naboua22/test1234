package com.example.demo1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "new_entity")
public class NewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}