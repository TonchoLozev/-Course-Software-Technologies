package com.bytown_08;

import java.util.Scanner;
import java.util.TreeMap;

public class Sum_By_Town_08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, Double> dict = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("\\|");

            String city = input[0].trim();
            double sum = Double.parseDouble(input[1].trim());

            if (!dict.containsKey(city)) {
                dict.put(city, sum);
            }
            else{
                dict.put(city, dict.get(city)+sum);
            }
        }
        for (String city : dict.keySet()) {
            System.out.println(city + " -> "+ dict.get(city));
        }
    }
}
