package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int j = 0; // индекс мах элемента
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                j = i;
            }

        }
        System.out.println("Максимальный элемент: " + max + ", индекс его последнего вхождения в массив: " + j);
    }
}
