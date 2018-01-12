package com.sumtwo_02;

import java.util.Scanner;

public class Sum_Two_Numbers_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());

        System.out.println(num1+num2);
    }
}
