package org.example;

public class Rectangle {
    double height;
    double width;

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    public Rectangle(double height){
        this.height=height;
    }
    public double getParameter(){
        return ((height*2)+(width*2));
    }

    public double getArea(){
        return (height*width);
    }
    public double getSquareParameter(){
        return (height*4);
    }
    public double getSquareArea(){
        return (height*height);
    }
}

