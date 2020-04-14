package com.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrintWeird {


    private static final Scanner scanner = new Scanner(System.in);

    public static Boolean checkWeirdo(int N) {
        if (N%2 > 0) {
            return true;
        } else if ((N%2 == 0) ) {
            if (N >= 2 && N <= 5) {
                return true;
            } else if (N >= 6 && N <= 20) {
                return true;
            } else if (N > 20) {
                return false;
            }
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N >= 1 && N <= 100) {
            String s = checkWeirdo(N) == true ? "Weird" : "Not Weird";
            System.out.println("number is : " + s);
        } else {
            System.out.println("N must be between 1 to 100.");
            System.exit(1);
        }
    }
}

