package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner scanner = new Scanner(in);
        System.out.print("=");
        int a = scanner.nextInt();

        for (int i = a; i > 1; i--) {
            if (i%2==0){
                System.out.println(i+" ");
            }

        }







    }
}
