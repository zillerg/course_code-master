package com.school.javacore.methods;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class MethodsExcercisesTest {
    MethodsExcercises methodsExcercises = new MethodsExcercises();

    @Test
    public void testFindSmallest(){
        //test if given numbers 1 2 3 method is going to return 1
        int actualResult = methodsExcercises.findSmallest(1,2, 3);
        assertEquals("Should return 1 on 1,2,3", 1, actualResult);
        assertNotNull("the result should not be null", actualResult);

        int actualResultNegative = methodsExcercises.findSmallest(-100, 9, -10);
        assertEquals("Should return -100 on -100, 9, -10", -100, actualResultNegative);

        int actualResultEqualNumber = methodsExcercises.findSmallest(10, 10, 10);
        assertEquals("Should return any of given number", 10, actualResultEqualNumber);
    }
    @Test
    public void testLoneSum(){
        int actualResult = methodsExcercises.loneSum(1,2,3);
        assertEquals("Should return sum of 1,2,3", 6, actualResult);

        int actualResultForTwoSameNumbers = methodsExcercises.loneSum(1,2,2);
        assertEquals("Should return 1 same numbers are not included in sum", 1, actualResultForTwoSameNumbers);

        int actualResultForAllEqualNumbers = methodsExcercises.loneSum(2,2,2);
        assertEquals("Should return 0, all elements are equal to each other",0,  actualResultForAllEqualNumbers);
    }
}
