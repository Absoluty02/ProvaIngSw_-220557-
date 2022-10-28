package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class FunnyAlgorithmsTest
{
    /**
     * Rigorous Test :-)
     */

    Integer binarySearchTarget;
    int binarySearchTargetPosition;
    ArrayList<Integer> binarySearchArray;
    ArrayList<Integer> UnorderedArray;
    ArrayList<Integer> OrderedArray;
    int convertedNumber;

    FunnyAlgorithms f;

    @Before
    public void ArraysInitialize(){
        binarySearchArray = new ArrayList<>(Arrays.asList(10,34,21,54,7,24,4));
        binarySearchTarget = 7;
        binarySearchTargetPosition = 4;

        f = new FunnyAlgorithms();

        UnorderedArray = new ArrayList<>(Arrays.asList(10,43,23,5,67));
        OrderedArray = new ArrayList<>(Arrays.asList(5,10,23,43,67));

        convertedNumber = 43;

    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
