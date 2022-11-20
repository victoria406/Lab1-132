/**Author
 * Victoria Lynne White
 * Last Updated 7/1/2022
 */

package org.example;

public class LoopDemo {
    static int arr[]={20, 34, 54, 100, -1, 34, 20, 23, 89, 45, 45,99, 121, 343};
    static int maximum() {
        int i;
        int biggest = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
    static int minimum() {
        int j = 0;
        int smallest = Integer.MAX_VALUE;
        while (j < arr.length) {
            if (arr[j] < smallest) {
                smallest = arr[j];
            }
            j++;
        }
        return smallest;
    }
    //It was not specified whether to have the average as an integer or a float
    static int average(){
        int sum=0;
        for (int num:arr){
            sum += num;
        }
        return sum/arr.length;
    }
    static int reversal(){
        System.out.println("This is the array reversed ");
        int a;
        for (a=arr.length-1;a>=0;a--){
            System.out.println(arr[a]+" ");
        }
    return a;
    }
    public static void main(String[] args){
        System.out.println("The biggest integer in the array is "+maximum()+" and the smallest number is: "+minimum());
        System.out.println("The average of the array to the nearest whole number is "+average());
        reversal()
    }
}
