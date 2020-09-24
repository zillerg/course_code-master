package com.school.javacore.OOP.Inheritance;

import java.util.ArrayList;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Staff("Test", "Street1","School1",1000.0);
        Person p2 = new Student("Student1","Street2","Developer",2020,1000.0);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);

        System.out.println(p1);
        System.out.println(p2);

        for (Person p: personArrayList) {
            System.out.println(p.getClass().equals(Staff.class));
            if(p instanceof Staff){
                System.out.println("discounts 1%!");
            }else if(p instanceof Student){
                System.out.println("discount 40%!");
            } else{
                System.out.println("Sorry no discounts");
            }
        }
    }
}
