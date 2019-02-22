package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        int number= Integer.parseInt(scan.nextLine());
        int binary = Integer.parseInt(scan.nextLine());

        String convert = Integer.toBinaryString(number);
        int counter = 0;

        for (int i = 0; i < convert.length(); i++) {
            if (convert.charAt(i) - '0' == binary){
                counter++;
            }
        }
        System.out.printf("%d", counter);

    }
}
