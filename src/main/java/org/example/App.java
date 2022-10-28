package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FunnyAlgorithms f = new FunnyAlgorithms();

        int[] array = new int[]{5,23,10,43,67};
        f.selectionSort(array, 1);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
