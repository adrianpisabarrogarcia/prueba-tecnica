package com.sheep;

public class Sheep {
    //Atributes
    private String name;
    private String color;

    //Constructors
    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Other methods

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
