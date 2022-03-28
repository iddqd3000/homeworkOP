package com.company;

public class MyPoint {
    public int x;
    public int y;


    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] xyList = {x,y};
        return xyList;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(int x1, int y1){
        double d = Math.sqrt((x1 - this.x)*(x1 - this.x)+ (y1-this.y)*(y1-this.y));
        return d;
    }
    public double distance(){
        return Math.sqrt((- this.x)*(- this.x)+ (-this.y)*(-this.y));
    }
    public double distance(MyPoint another){
        return Math.sqrt((another.x - this.x)*(another.x - this.x)+ (another.y-this.y)*(another.y-this.y));
    }
}
