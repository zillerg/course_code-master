package com.school.javacore.OOP;

public class RectangleDemo {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.3f, 4.5f);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
