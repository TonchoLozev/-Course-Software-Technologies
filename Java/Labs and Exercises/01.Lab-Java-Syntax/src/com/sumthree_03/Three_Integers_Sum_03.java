package com.sumthree_03;

import java.util.Scanner;

public class Three_Integers_Sum_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 + num2 == num3) {
            System.out.printf("%.0f + %.0f = %.0f", Math.min(num1, num2), Math.max(num1, num2), num3);
        } else if (num2 + num3 == num1) {
            System.out.printf("%.0f + %.0f = %.0f", Math.min(num2, num3), Math.max(num2, num3), num1);
        } else if (num1 + num3 == num2) {
            System.out.printf("%.0f + %.0f = %.0f", Math.min(num1, num3), Math.max(num1, num3), num2);
        } else {
            System.out.printf("No");
        }
    }
}
