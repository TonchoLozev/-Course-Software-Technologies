package com.largest_three_06;

import java.lang.reflect.Array;
import java.util.*;

public class Largest_Three_Numbers_07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        int[] array = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int num = Integer.parseInt(words[i]);
            array[i] = num;
        }
        Arrays.sort(array);
        int count = 1;
        if (array.length < 3) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[array.length - count]);
                count++;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(array[array.length - count]);
                count++;
            }
        }

    }
}
