package com.sumNintegers_04;

import java.util.Scanner;

public class Sum_N_Integers_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            sum+=number;
        }
        System.out.printf("Sum = %d",sum);
    }
}
