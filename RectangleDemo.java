package org.example;

public class RectangleDemo {
    public static void main(String[] args){
        //rectangle with aesthetic language
        Rectangle myRectangle= new Rectangle(2.5,2.5);
        System.out.println("The parameter for a rectangle with height "+myRectangle.height+" and width "+myRectangle.width+" is "+
                myRectangle.getParameter());
        System.out.println("The area for a rectangle with height "+myRectangle.height+" and width "+myRectangle.width+" is "+
                myRectangle.getArea());
        //square with minimum details (running out of time)
        Rectangle mySquare=new Rectangle(3.5);
        System.out.println("Square Parameter: "+mySquare.getSquareParameter());
        System.out.println("Square Area: "+mySquare.getSquareArea());
    }

}
