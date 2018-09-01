/*
Bubble Sort implementation
*/

import java.util.Random;

public class Main {

    private static int[] bubSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] insertSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] intArr = new int[15];
        int[] sortedArr;
        // filling the array with random stuff
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = getRandomNumberInRange(1, 99);
        }

        int[] arr2 = intArr.clone();
        int[] arr3 = intArr.clone();

        System.out.println("\nOriginal Array is: ");
        for (int anInt : intArr) {
            System.out.print(anInt + " ");
        }


        sortedArr = bubSort(arr2);
        System.out.println("\nBubble Sorted Array is: ");
        for (int anInt : sortedArr) {
            System.out.print(anInt + " ");
        }


        sortedArr = selectSort(arr3);
        System.out.println("\nSelection Sorted Array is: ");
        for (int anInt : sortedArr) {
            System.out.print(anInt + " ");
        }

        sortedArr = insertSort(intArr);
        System.out.println("\nInsertion Sorted Array is: ");
        for (int anInt: sortedArr) {
            System.out.print(anInt + " ");
        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
