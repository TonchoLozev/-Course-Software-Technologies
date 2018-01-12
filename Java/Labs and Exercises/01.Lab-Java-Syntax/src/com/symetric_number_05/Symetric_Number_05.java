package com.symetric_number_05;

import java.util.Scanner;

public class Symetric_Number_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


        for (int i = 1; i <= number; i++) {

            String str = Integer.toString(i);
            if(i < 10){
                System.out.println(i);
            }
            if (isSymetric(str)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSymetric(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
