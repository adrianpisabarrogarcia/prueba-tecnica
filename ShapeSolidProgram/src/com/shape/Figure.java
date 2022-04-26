package com.shape;

public class Figure{
    public double area;

    public Figure(double area){
        this.area = area;
    }
    public Figure(){
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void calculateArea(Object o){
        Figure f = new Figure();
        if (o instanceof Circle){
            Circle circle = (Circle) o;
            f.setArea(circle.getArea());
        }
        if (o instanceof Rectangle){
            Rectangle rectangle = (Rectangle) o;
            f.setArea(rectangle.getArea());
        }
        if (o instanceof Square){
            Square square = (Square) o;
            f.setArea(square.getArea());
        }
        f.toStringArea(o);
    }

    public void toStringArea(Object o){
        System.out.println("The area of the " + o.getClass().getSimpleName() + " is " + this.area);
    }

}
