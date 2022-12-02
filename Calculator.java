
package org.example;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Calculator{
    static void addTwoNumbers(double numa,double numb){
        System.out.println(numa+numb);
    }

    public static double subtractTwoNumbers(double numa,double numb){
        return numa-numb;
    }

    public static double multiplyTwoNumbers(double numa,double numb){
        return numa*numb;
    }

    public static double showingModule(double numa, double numb){
        return numa%numb;
    }

    public static double calcPower(double numa, double numb){
        return Math.pow(numa,numb);
    }

    public static double calcSqrRt(double numa){
        return Math.sqrt(numa);
    }
    public static void main(String []args){
        addTwoNumbers(2.5,2.5);
        System.out.println(subtractTwoNumbers(2.5,2.5));
        System.out.println(multiplyTwoNumbers(2.5,2.5));
        System.out.println(showingModule(2.5,2.5));
        System.out.println(calcPower(2.5,2.5));
        System.out.println(calcSqrRt(2.5));
    }
}
//I am sorry if all the print statements are annoying, I am unsure what good programming practice looks like
//and the print statemetns were just convienient