package org.example;

import org.junit.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
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
    int[] UnorderedArray1;
    int[] UnorderedArray2;
    int[] IncreasingOrderedArray;
    int[] DecreasingOrderedArray;
    int convertedNumber;

    FunnyAlgorithms f;

    @Before
    public void ArraysInitialize(){

        System.out.println("Initialization starts at " + LocalDateTime.now());

        binarySearchArray = new int[]{1,2,3,4,5,6,7};
        binarySearchTarget = 4;
        binarySearchTargetPosition = 3;

        f = new FunnyAlgorithms();

        UnorderedArray1 = new int[]{10,43,23,5,67};
        UnorderedArray2 = new int[]{10,43,23,5,67};
        IncreasingOrderedArray = new int[]{5,10,23,43,67};
        DecreasingOrderedArray = new int[]{67,43,23,10,5};

        convertedNumber = 43;

        System.out.println("Initialization finished at " + LocalDateTime.now());


    }

    @Test
    public void SelectionSortTest(){

        System.out.println("Test starts at " + LocalDateTime.now());

        f.selectionSort(UnorderedArray1, 0);
        Assert.assertArrayEquals(IncreasingOrderedArray, UnorderedArray1);

        System.out.println("Test finished at " + LocalDateTime.now());

    }

    @Test
    public void BinarySearchTest(){

        System.out.println("Test starts at " + LocalDateTime.now());

        Assert.assertEquals(binarySearchTargetPosition, f.binarySearch(binarySearchArray, binarySearchTarget));

        System.out.println("Test finished at " + LocalDateTime.now());
    }

    @Test
    public void StringToIntConverterTest()
    {
        System.out.println("Test starts at " + LocalDateTime.now());

        Assert.assertEquals( convertedNumber, f.stringToIntConverter("43") );

        System.out.println("Test finished at " + LocalDateTime.now());
    }
}
