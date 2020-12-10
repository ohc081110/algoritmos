/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmos;

import java.util.Arrays;
//import java.util.Scanner;

/**
 *
 * @author Hernandez
 */
public class InsertionSort
{
      public static void main(String[] args){
int[] array = new int[]{1, 7, 5, 6, 9, 4666666, 2, 3,100,200,1000000,6};
insertionSort(array);
System.out.println(Arrays.toString(array));
 
 
    }
      
      public static void insertionSort(int array[]) {
    for (int j = 1; j < array.length; j++) {
        int current = array[j];
        int i = j-1;
        while ((i > -1) && (array[i] > current)) {
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = current;
    }
}
    
}

