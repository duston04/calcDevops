package org.example;

import org.example.services.Factorial;
import org.example.services.Logrithm;
import org.example.services.Power;
import org.example.services.SqRoot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalcTest {

    private static final double DELTA = 1e-15;
    Factorial factorial = new Factorial();
    SqRoot sqRoot = new SqRoot();

    Logrithm logrithm = new Logrithm();
    Power power = new Power();

    @Test
    public void squarerootTestTruePositive(){
        assertEquals("Test for Square Root with true positive", 3, sqRoot.root(9), DELTA);
        assertEquals("Test for Square Root with true positive", 0, sqRoot.root(0), DELTA);
        assertEquals("Test for Square Root with true positive", 1, sqRoot.root(1), DELTA);
        assertEquals("Test for Square Root with true positive", 5, sqRoot.root(25), DELTA);
    }

    @Test
    public void squarerootTestFalsePositive(){
        assertNotEquals("Test for Square Root with False positive", 7, sqRoot.root(9), DELTA);
        assertNotEquals("Test for Square Root with False positive", 1, sqRoot.root(0), DELTA);
        assertNotEquals("Test for Square Root with False positive", 0, sqRoot.root(1), DELTA);
        assertNotEquals("Test for Square Root with False positive", 20, sqRoot.root(25), DELTA);
    }


    @Test
    public void factorialTestTruePositive(){
        assertEquals("Test for factorial with true positive", 120, factorial.factorial(5), DELTA);
        assertEquals("Test for factorial with true positive", 6, factorial.factorial(3), DELTA);
        assertEquals("Test for factorial with true positive", 1, factorial.factorial(0), DELTA);
        assertEquals("Test for factorial with true positive", 1, factorial.factorial(1), DELTA);
    }

    @Test
    public void factorialTestFalsePositive(){
        assertNotEquals("Test for factorial with false positive", 125, factorial.factorial(5), DELTA);
        assertNotEquals("Test for factorial with false positive", 0, factorial.factorial(0), DELTA);
        assertNotEquals("Test for factorial with false positive", 0, factorial.factorial(1), DELTA);
        assertNotEquals("Test for factorial with false positive", 9, factorial.factorial(3), DELTA);
    }


    @Test
    public void logarithmTestTruePositive(){
        assertEquals("Test for logarithm with true positive", 0, logrithm.log(1), DELTA);
        assertEquals("Test for logarithm with true positive", 1, logrithm.log(Math.exp(1)), DELTA);
    }

    @Test
    public void logarithmTestFalsePositive(){
        assertNotEquals("Test for logarithm with false positive", 1, logrithm.log(10), DELTA);
        assertNotEquals("Test for logarithm with false positive", 0, logrithm.log(Math.exp(1)), DELTA);
        assertNotEquals("Test for logarithm with false positive", 1, logrithm.log(1), DELTA);
    }


    @Test
    public void powerTestTruePositive(){
        assertEquals("Test for power fn with true positive", 125, power.power(5,3), DELTA);
        assertEquals("Test for power fn with true positive", 1, power.power(0,0), DELTA);
        assertEquals("Test for power fn with true positive", 1, power.power(1,5), DELTA);
        assertEquals("Test for power fn with true positive", 9, power.power(3,2), DELTA);
    }

    @Test
    public void powerTestFalsePositive(){
        assertNotEquals("Test for power fn with false positive", 125, power.power(5,2), DELTA);
        assertNotEquals("Test for power fn with false positive", 0, power.power(0,0), DELTA);
        assertNotEquals("Test for power fn with false positive", 5, power.power(1,5), DELTA);
        assertNotEquals("Test for power fn with false positive", 6, power.power(3,2), DELTA);
    }

}
