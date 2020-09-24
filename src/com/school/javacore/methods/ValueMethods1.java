package com.school.javacore.methods;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class ValueMethods1 {
    /*less than 16
           "You
    can't drive."
           16 to 17
           "You can
    drive but not vote."
           18 to 24
            "You can
    vote but not rent a car."
            25 or older
   "You can
        do pretty much anything."*/

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your age(number)!");
        int age = userInput.nextInt();
        decideByAge(age);
        int age1 = userInput.nextInt();
        decideByAge(age1);
        int age2 = userInput.nextInt();
        decideByAge(age2);

    }

    public static void decideByAge(int age){
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age > 16 && age <= 17) {
            System.out.println("You can drive, but you can not vote!");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car.");
        } else {
            System.out.println("You can do pretty much anything.");
        }
    }
}
