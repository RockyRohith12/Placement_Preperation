package Java.datatypes;

import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        //arrays store same data type

        int[] a = new int[5];   // by default it stores 0 as element 

        a[4] = 5;

        System.out.println(a[1]);
        System.out.println(a[4]);

        System.out.println();
        System.out.println("Enter the array: ");
        for(int i = 0; i< a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println();


        for(int i = 0; i < 5; i++){    //print an array
            System.out.println(a[i]);
        }


    }
}
