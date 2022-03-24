package com.company;

public class MyPoint {
    private int x;
    private int y;


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
        getX();
        getY();
        int xyList[] = {x, y};
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
    public double distance(int x, int y){
        double d = Math.sqrt((x - this.x)*(x - this.x)+ (y-this.y)*(y-this.y));
        return d;
    }
    public double distance(){
        double d = Math.sqrt((0 - this.x)*(0 - this.x)+ (0-this.y)*(0-this.y));
        return d;
    }
}
