package com.main;

import com.sheep.Sheep;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            // Create sheeps objects
            Sheep sheep1 = new Sheep("Noa", "azul");
            Sheep sheep2 = new Sheep("Euge", "rojo");
            Sheep sheep3 = new Sheep("Navidad", "rojo");
            Sheep sheep4 = new Sheep("Ki Na Ma", "rojo");
            Sheep sheep5 = new Sheep("AAAAAaaaaa", "rojo");
            Sheep sheep6 = new Sheep("Nnnnnnnn", "rojo");

            // Create an array of sheeps
            ArrayList<Sheep> sheeps = new ArrayList<>();
            sheeps.add(sheep1);
            sheeps.add(sheep2);
            sheeps.add(sheep3);
            sheeps.add(sheep4);
            sheeps.add(sheep5);
            sheeps.add(sheep6);

            // Print the sheeps
            for (Sheep sheep : sheeps) {
                String lowerCaseName = sheep.getName().toLowerCase();
                if (
                        sheep.getColor().equalsIgnoreCase("rojo")
                        &&
                        lowerCaseName.contains("n")
                        &&
                        lowerCaseName.contains("a")
                )
                    System.out.println(sheep);
            }

    }
}
