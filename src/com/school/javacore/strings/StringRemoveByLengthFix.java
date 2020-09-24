package com.school.javacore.strings;

import java.util.ArrayList;

public class StringRemoveByLengthFix {
    public static void removeLongStrings(ArrayList<String> list)
    {
        for (int i=0; i<list.size();i++) {
            if (list.get(i).length() > 4)
                list.remove(i);
        }
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i ++)
        {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }
}
