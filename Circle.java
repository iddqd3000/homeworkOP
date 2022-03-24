package com.company;

public class Circle {
    private double radius;
    private String color;
    
    public Circle(){}
    public Circle(double radius){
       this.radius = radius;  
    }
    public Circle(double radius, String color){
       this.radius = radius;
       this.color = color;
    }


    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        return (double) (Math.PI * Math.sqrt(radius));
    }
}
