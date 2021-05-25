package com.example.persistance.entity;

import java.time.LocalDate;

public class Shopping {
    private Integer id;
    private String name;
    private Integer num;
    private String place;
    //private Boolean isDone;

    public Shopping(){}


    public Shopping(String name, Integer num, String place) {
        this.name = name;
        this.num = num;
        this.place = place;
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

    public Integer getNum() {
        return num;
    }
    public void setNum (Integer num) {
        this.num = num;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public String toString() {
        return "Shopping{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", place='" + place + '\'' +
                '}';
    }
}
