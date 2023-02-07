package com.jpa.test.Bootjpaexample.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String status;


    public User(int id, String name, String city, String status) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }
}
