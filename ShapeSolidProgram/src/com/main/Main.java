package com.main;

import com.shape.Circle;
import com.shape.Figure;
import com.shape.Rectangle;
import com.shape.Square;

public class Main {

    public static void main(String[] args) {

        // Create a new instance of the classes with the given parameters
        Figure figure = new Figure();
        figure.calculateArea(new Circle(4.2));
        figure.calculateArea(new Rectangle(4,6));
        figure.calculateArea(new Square(4.2));

    }
}
