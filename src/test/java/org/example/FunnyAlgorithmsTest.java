package org.example;

import org.junit.*;

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

    int binarySearchTarget;
    int binarySearchTargetPosition;
    int[] binarySearchArray;
    int[] UnorderedArray;
    int[] OrderedArray;
    int convertedNumber;

    FunnyAlgorithms f;

    @Before
    public void ArraysInitialize(){
        binarySearchArray = new int[]{1,2,3,4,5,6,7};
        binarySearchTarget = 4;
        binarySearchTargetPosition = 3;

        f = new FunnyAlgorithms();

        UnorderedArray = new int[]{10,43,23,5,67};
        OrderedArray = new int[]{5,10,23,43,67};

        convertedNumber = 43;

    }

    @Test
    public void BinarySearchTest(){
        Assert.assertEquals(binarySearchTargetPosition, f.binarySearch(binarySearchArray, binarySearchTarget));
    }

    @Test
    public void StringToIntConverterTest()
    {
        Assert.assertEquals( convertedNumber, f.stringToIntConverter("43") );
    }
}
