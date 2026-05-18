// Arrays : List of Elements of the same type, Placed in a contious memory location

// Creating a Array : dataType arrayName[] = new dataType[size];

import java.util.*;
public class Array_Basics {
    public static void main(String[] args) {

        // Declarations of Array

        // int marks[] = new int[50];

        // int numbers[] = {10,20,30};         //3
        // int moreNumbers[] = {40,50,60};     //3     

        // String fruits = {"apple", "mango", "banana"};       //3

        Scanner sc = new Scanner(System.in);

        // int phy; 
        // phy = sc.nextInt();

        int marks[] = new int[50];

        // Array Length (.length)
        // System.out.println("Length og Marks Array : " + marks.length);

        marks[0] = sc.nextInt();    //phy
        marks[1] = sc.nextInt();    //chem
        marks[2] = sc.nextInt();    //math

        System.out.println("Phy : " + marks[0]);
        System.out.println("Chem : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        sc.close();
    }
}


// ------------------------------------------------------------------- //
 
/* 

Passing Array as a Argument : 1) Pass by Value 2) Pass by Referencs

1. Pass by Value : wo main function ko change (affact) nahi krta hai.
2. Pass by Referencs : wo main function ko change (affact) karta hai.

*/ 