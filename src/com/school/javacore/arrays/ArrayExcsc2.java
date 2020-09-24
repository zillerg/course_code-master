package com.school.javacore.arrays;

import java.util.Scanner;

public class ArrayExcsc2 {

    public static void main(String[] args) {
        int[] numbers = {7,8,9,10,11};

        int sum = 0;
        int b = numbers.length - 1;

        while (b >= 0){
            sum += numbers[b];
            b--;
        }

        printIntArray(numbers);
        System.out.println("The sum is "+sum);

        Scanner userInput = new Scanner(System.in);
        String searchBook = userInput.next();

        String[] bookShelf = {"book1", "book2", "book3", "book4"};
        boolean bookFound = false;
        for (int i = 0; i < bookShelf.length; i++){
            if (searchBook.equals(bookShelf[i])){
                System.out.println("Bingo , I found the book, the book is in "+i);
                bookFound = true;
                break;
            }else {
                System.out.println("I did not find the book!");
            }
        }
        /*if (bookFound == false) {
            System.out.println("Sorry, there is no such book!");
        }*/



    }

    public static void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }
}
