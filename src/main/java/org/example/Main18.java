package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.random.RandomGenerator;

// write method one para integer array random number 0-9 not sorted but one of the number is missing return the missing
public class Main18 {
    public static void main (String [] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        // add random 0-9
//        arrayList.add(1);
//        arrayList.add(0);
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(3);
//        arrayList.add(5);
//        arrayList.add(8);
//        arrayList.add(7);
//        arrayList.add(9); //missing 6
//        System.out.println("Missing integer " + returnMissing(arrayList));

        System.out.println("Expected result: true, Actual result: " + returnOverlap(new int[]{2,3}, new int[]{1,2}));
        System.out.println("Expected result: false, Actual result: " + returnOverlap(new int[]{4,5}, new int[]{1,2}));
        System.out.println("Expected result: true, Actual result: " + returnOverlap(new int[]{-4,2}, new int[]{1,3}));
        System.out.println("Expected result: true, Actual result: " + returnOverlap(new int[]{1,2}, new int[]{0,3}));
        System.out.println("Expected result: true, Actual result: " + returnOverlap(new int[]{1,2}, new int[]{1,2}));
    }

    public static int returnMissing(ArrayList<Integer> arrayList) {
        int missing = 9;
        // sort the arraylist
        Collections.sort(arrayList);
        System.out.print(arrayList);
        System.out.println();
        // check i with the sorted arraylist
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != i) { // check when index is 0 then = 0 etc
                missing = i;
                break;
            }
        }
        return missing;
    }

    // write method check overlapping (int array 2 para) (check 2 array has same int or not)
    public static boolean returnOverlap (int[] arr1, int[]arr2) {
        boolean overlap = false;
        // 2 for loop
        for (int i = arr1[0]; i <= arr1[arr1.length-1]; i++) {
            for (int j = arr2[0]; j <= arr2[arr2.length-1]; j++) {
//                System.out.println(i + "vs" + j);
                if (i == j) {
                    overlap = true;
                    break;
                }
            }
        }
        return overlap;
    }
}
