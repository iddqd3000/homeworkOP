package com.company;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
    public double getPerimetr(){
        return (length + width) * 2;
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
