package Strings;

import java.util.Scanner;

public class String_Basic {
    // public static void printArr(String fullName) {
    //     for(int i=0; i<fullName.length(); i++){
    //         System.out.print(fullName.charAt(i) + " ");
    //     }
    // }
    public static void main(String[] args) {
        // char arr[] = {'c','e','w'};

        // String str1 = "Saurav";
        // String str2 = new String("Saurav");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);

        // String name;
        // name = sc.next();
        // name = sc.nextLine();
        // System.out.print(name);

        // String fullName = "Saurav Pandit";
        // System.out.println(fullName.length());

        // concatenation

        // String firstName = "Saurav";
        // String lastName = "Pandit";

        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);

        // printArr(fullName);

        // Comapre function
        
        // String s1 = "Om";
        // String s2 = "Om";
        // String s3 = new String("Om");

        // if(s1 == s2){
        //     System.out.println("Strings are Equale");
        // }else{
        //     System.out.println("Strings are not Equale");
        // }

        // if(s1 == s3){
        //     System.out.println("Strings are Equale");
        // }else{
        //     System.out.println("Strings are not Equale");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("Strings are Equale");
        // }else{
        //     System.out.println("Strings are not Equale");
        // }

        // Substring
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));

        // StringBuilder

        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);

        sc.close();
    }
}
